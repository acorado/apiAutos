package com.example.demo.Controllers;

import java.util.List;
import java.util.Optional;

import com.example.demo.Data.autos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin("*")
@RequestMapping(path = "/api")
public class AutosController {

@Autowired
private  com.example.demo.Data.adm_Autos_repository adm_Autos_repository;
    
	@GetMapping("/autos")
    public List<autos> getAllautos() {
        return adm_Autos_repository.findAll();
    }

    @GetMapping("/autos/{idAutos}")
    public Optional<autos> getAutos(@PathVariable int idAutos)
    {
        return adm_Autos_repository.findById(idAutos);

    }
    

    @PostMapping("/autos")
    public autos newAutos(@RequestBody autos newAutos) {
        return adm_Autos_repository.save(newAutos);
    }


   


}
