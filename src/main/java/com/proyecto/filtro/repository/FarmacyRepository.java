package com.proyecto.filtro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.filtro.entity.Farmacy;

@Repository
public interface FarmacyRepository extends JpaRepository<Farmacy, Long>, FarmacyRepositoryPort{

}
