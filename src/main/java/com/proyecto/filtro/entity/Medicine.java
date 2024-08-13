package com.proyecto.filtro.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String proceedings;
    private String name;
    private String healthregister;
    private String description;
    private String descriptionShort;
    private String nameRol;

    @ManyToOne
    private ActivePrinciple activePrinciple;

    @ManyToOne
    private Laboratory laboratory;

    @ManyToOne
    private ModeAdministration modeAdministration;

    @ManyToOne
    private UnitMeasurement unitMeasurement;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProceedings() {
        return proceedings;
    }

    public void setProceedings(String proceedings) {
        this.proceedings = proceedings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHealthregister() {
        return healthregister;
    }

    public void setHealthregister(String healthregister) {
        this.healthregister = healthregister;
    }

    

    public String getDescriptionShort() {
        return descriptionShort;
    }

    public void setDescriptionShort(String descriptionShort) {
        this.descriptionShort = descriptionShort;
    }

    public String getNameRol() {
        return nameRol;
    }

    public void setNameRol(String nameRol) {
        this.nameRol = nameRol;
    }

    public ActivePrinciple getActivePrinciple() {
        return activePrinciple;
    }

    public void setActivePrinciple(ActivePrinciple activePrinciple) {
        this.activePrinciple = activePrinciple;
    }

    public Laboratory getLaboratory() {
        return laboratory;
    }

    public void setLaboratory(Laboratory laboratory) {
        this.laboratory = laboratory;
    }

    public ModeAdministration getModeAdministration() {
        return modeAdministration;
    }

    public void setModeAdministration(ModeAdministration modeAdministration) {
        this.modeAdministration = modeAdministration;
    }

    public UnitMeasurement getUnitMeasurement() {
        return unitMeasurement;
    }

    public void setUnitMeasurement(UnitMeasurement unitMeasurement) {
        this.unitMeasurement = unitMeasurement;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
    
}
