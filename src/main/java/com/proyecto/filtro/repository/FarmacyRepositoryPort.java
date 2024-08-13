package com.proyecto.filtro.repository;

import java.util.List;
import java.util.Optional;


import com.proyecto.filtro.entity.Farmacy;

public interface FarmacyRepositoryPort {
    Farmacy save(Farmacy farmacy);

    Optional<Farmacy> findById(Long id);

    void deleteById(Long id);

    List<Farmacy> findAll();

    // Farmacy update(Long id, Farmacy farmacy);
}
