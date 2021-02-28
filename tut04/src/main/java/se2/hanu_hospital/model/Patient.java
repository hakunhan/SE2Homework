package se2.hanu_hospital.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "patient")
public class Patient {
    @Id
    @SequenceGenerator(name = "patient_sequence", sequenceName = "patient_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "patient_sequence")
    private int id;
    private String name;
    private String phoneNumber;
    private String address;
    private String bloodType;

    @OneToMany(mappedBy = "patient")
    private Set<MedicalRecord> medicalRecords;

    public Patient(int id, String name, String phoneNumber, String address, String bloodType) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.bloodType = bloodType;
    }

    public Patient(String name, String phoneNumber, String address, String bloodType) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.bloodType = bloodType;
    }

    public Patient() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }
}
