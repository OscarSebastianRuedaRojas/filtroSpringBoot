package com.proyecto.filtro.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity

public class FarmacyMedicine {
    @Id
    @ManyToOne
    private Farmacy farmacy;

    @Id
    @ManyToOne
    private Medicine medicine;

    private float price;

    public Farmacy getFarmacy() {
        return farmacy;
    }

    public void setFarmacy(Farmacy farmacy) {
        this.farmacy = farmacy;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    


}

