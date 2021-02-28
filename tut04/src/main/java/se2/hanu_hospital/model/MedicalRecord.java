package se2.hanu_hospital.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class MedicalRecord {
    @Id
    @SequenceGenerator(name = "medicalRecord_sequence", sequenceName = "medicalRecord_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "medicalRecord_sequence")
    private int id;
    private String disease;
    private String treatmentNote;
    private LocalDate treatmentDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="drugList_id", referencedColumnName = "id")
    private DrugList drugList;

    @ManyToOne
    @JoinColumn(name="patient_id", nullable = false)
    private Patient patient;


    public MedicalRecord(int id, Patient patient, String disease, String treatmentNote, LocalDate treatmentDate, DrugList drugList) {
        this.id = id;
        this.patient = patient;
        this.disease = disease;
        this.treatmentNote = treatmentNote;
        this.treatmentDate = treatmentDate;
        this.drugList = drugList;
    }

    public MedicalRecord(Patient patient, String disease, String treatmentNote, LocalDate treatmentDate, DrugList drugList) {
        this.patient = patient;
        this.disease = disease;
        this.treatmentNote = treatmentNote;
        this.treatmentDate = treatmentDate;
        this.drugList = drugList;
    }

    public MedicalRecord() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getTreatmentNote() {
        return treatmentNote;
    }

    public void setTreatmentNote(String treatmentNote) {
        this.treatmentNote = treatmentNote;
    }

    public LocalDate getTreatmentDate() {
        return treatmentDate;
    }

    public void setTreatmentDate(LocalDate treatmentDate) {
        this.treatmentDate = treatmentDate;
    }

    public DrugList getDrugList() {
        return drugList;
    }

    public void setDrugList(DrugList drugList) {
        this.drugList = drugList;
    }

    @Override
    public String toString() {
        return "MedicalRecord{" +
                "id=" + id +
                ", patient=" + patient +
                ", disease='" + disease + '\'' +
                ", drugList=" + drugList +
                ", treatmentNote='" + treatmentNote + '\'' +
                ", treatmentDate=" + treatmentDate +
                '}';
    }
}
