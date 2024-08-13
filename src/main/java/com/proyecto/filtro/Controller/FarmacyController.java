package com.proyecto.filtro.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.filtro.dto.FarmacyDto;
import com.proyecto.filtro.entity.Farmacy;
import com.proyecto.filtro.services.FarmacyService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/farmacy")
public class FarmacyController {

    @Autowired
    private FarmacyService farmacyService;

    @PostMapping("/create")
    public Farmacy createFarmacyDto(@RequestBody FarmacyDto farmacy){
        return farmacyService.createFarmacy(farmacy);
    }

    @GetMapping("/getAll")
    public List<Farmacy> getFarmacies(){
        return farmacyService.getAllFarmacies();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteFarmacy(@PathVariable Long id){
        farmacyService.deleteFarmacyById(id);
    }

    @GetMapping("/getById/{id}")
    public Farmacy getFarmacyById(@PathVariable Long id){
        return farmacyService.getFarmacyById(id).orElse(null);
    }

    // @PutMapping("/update/{id}")
    // public Farmacy updateFarmacy(@PathVariable Long id, @RequestParam Farmacy farmacy){
    //     return farmacyService.updateFarmacy(id, farmacy);
    // }
}
