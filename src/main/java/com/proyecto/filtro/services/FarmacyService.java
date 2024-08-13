package com.proyecto.filtro.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.proyecto.filtro.entity.Farmacy;
import com.proyecto.filtro.repository.FarmacyRepositoryPort;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FarmacyService {

    private final FarmacyRepositoryPort farmacyRepositoryPort;

    public Farmacy createFarmacy(Farmacy farmacy) {
        return farmacyRepositoryPort.save(farmacy);
    }

    public Optional<Farmacy> getFarmacyById(Long id) {
        return farmacyRepositoryPort.findById(id);
    }

    public void deleteFarmacyById(Long id) {
        farmacyRepositoryPort.deleteById(id);
    }

    public List<Farmacy> getAllFarmacies() {
        return farmacyRepositoryPort.findAll();
    }
    
    public Farmacy updateFarmacy(Long id, Farmacy farmacy) {
        return farmacyRepositoryPort.updateOneById(id, farmacy);
    }

}
