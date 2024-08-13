package com.proyecto.filtro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.filtro.entity.City;

public interface CityRepository extends JpaRepository<City, Long>, CityRepositoyPort{
    
}
