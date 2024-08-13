package com.proyecto.filtro.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class ModeAdministration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descriptionMode;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getDescriptionMode() {
        return descriptionMode;
    }
    public void setDescriptionMode(String descriptionMode) {
        this.descriptionMode = descriptionMode;
    }
    
}
