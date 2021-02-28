package se2.hanu_hospital.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table (name = "drugList")
public class DrugList {
    @Id
    @SequenceGenerator(name = "drugList_sequence", sequenceName = "drugList_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "drugList_sequence")
    @Column(name = "id", updatable = false)
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="drug_id", referencedColumnName = "id")
    private Drug drug;

    private int drugQuantity;

    public DrugList(int id, Drug drug, int drugQuantity) {
        this.id = id;
        this.drug = drug;
        this.drugQuantity = drugQuantity;
    }

    public DrugList() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    public int getDrugQuantity() {
        return drugQuantity;
    }

    public void setDrugQuantity(int drugQuantity) {
        this.drugQuantity = drugQuantity;
    }

    @Override
    public String toString() {
        return "DrugList{" +
                "id=" + id +
                ", drug=" + drug +
                ", drugQuantity=" + drugQuantity +
                '}';
    }
}
