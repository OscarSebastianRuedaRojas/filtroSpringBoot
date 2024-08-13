package com.proyecto.filtro.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.proyecto.filtro.dto.FarmacyDto;
import com.proyecto.filtro.entity.Farmacy;
import com.proyecto.filtro.repository.CityRepositoyPort;
import com.proyecto.filtro.repository.FarmacyRepositoryPort;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FarmacyService {

    private final FarmacyRepositoryPort farmacyRepositoryPort;
    private final CityRepositoyPort cityRepositoyPort;

    public Farmacy createFarmacy(FarmacyDto farmacy) {
        Farmacy farmacyImport = new Farmacy();
        farmacyImport.setName(farmacy.getName());
        farmacyImport.setAddress(farmacy.getAddress());
        farmacyImport.setLon(farmacy.getLon());
        farmacyImport.setLat(farmacy.getLat());
        farmacyImport.setLogoFarmacy(farmacy.getLogoFarmacy());
        farmacyImport.setCity(cityRepositoyPort.findById(farmacy.getCity_id()).get());
        return farmacyRepositoryPort.save(farmacyImport);
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
    
    // public Farmacy updateFarmacy(Long id, Farmacy farmacy) {
    //     return farmacyRepositoryPort.update(id, farmacy);
    // }

}
