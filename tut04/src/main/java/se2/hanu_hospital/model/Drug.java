package se2.hanu_hospital.model;

import javax.persistence.*;

@Entity
@Table (name = "Drug")
public class Drug {
    @Id
    @SequenceGenerator(name = "drug_sequence", sequenceName = "drug_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "drug_sequence")
    @Column(name = "id", updatable = false)
    private int id;
    private String drugName;
    private double drugPrice;

    public Drug(int id, String drugName, double drugPrice) {
        this.id = id;
        this.drugName = drugName;
        this.drugPrice = drugPrice;
    }

    public Drug() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Drug(String drugName, double drugPrice) {
        this.drugName = drugName;
        this.drugPrice = drugPrice;
    }
    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public double getDrugPrice() {
        return drugPrice;
    }

    public void setDrugPrice(double drugPrice) {
        this.drugPrice = drugPrice;
    }

    @Override
    public String toString() {
        return "Drug{" +
                "id=" + id +
                ", drugName='" + drugName + '\'' +
                ", drugPrice=" + drugPrice +
                '}';
    }
}
