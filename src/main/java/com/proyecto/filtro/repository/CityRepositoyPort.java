package com.proyecto.filtro.repository;


import java.util.Optional;

import com.proyecto.filtro.entity.City;

public interface CityRepositoyPort {

    Optional<City> findById(Long id);
}
