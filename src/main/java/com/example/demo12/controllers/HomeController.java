package com.example.demo12.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo12.model.Clinic;
import com.example.demo12.model.ClinicRepository;

@Controller
@RequestMapping(path = "/demo")
public class HomeController {
    @Autowired
    private ClinicRepository clinicRepository;

    @PostMapping(path = "/add")
    public @ResponseBody String addClinic (@RequestParam String name, @RequestParam String address){
        Clinic clinic = new Clinic();
        clinic.setName(name);
        clinic.setAddress(address);
        clinicRepository.save(clinic);
        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Clinic> getAllClinics() {
        return clinicRepository.findAll();
    }
}
