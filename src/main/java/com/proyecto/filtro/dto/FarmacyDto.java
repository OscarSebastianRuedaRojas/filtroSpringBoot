package com.proyecto.filtro.dto;

public class FarmacyDto {
    
    private String name;
    private String address;
    private float lon;
    private float lat;
    private String logoFarmacy;
    private Long city_id;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public float getLon() {
        return lon;
    }
    public void setLon(float lon) {
        this.lon = lon;
    }
    public float getLat() {
        return lat;
    }
    public void setLat(float lat) {
        this.lat = lat;
    }
    public String getLogoFarmacy() {
        return logoFarmacy;
    }
    public void setLogoFarmacy(String logoFarmacy) {
        this.logoFarmacy = logoFarmacy;
    }
    public Long getCity_id() {
        return city_id;
    }
    public void setCity_id(Long city_id) {
        this.city_id = city_id;
    }

    
}
