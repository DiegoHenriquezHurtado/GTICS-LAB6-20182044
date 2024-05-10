package com.example.lab6_gtics.controller;

import com.example.lab6_gtics.entity.Technician;
import com.example.lab6_gtics.repository.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HomeController {
    final DeviceRepository deviceRepository;
    final LocationRepository locationRepository;
    final SiteRepository siteRepository;
    final TechnicianRepository technicianRepository;
    final TicketRepository ticketRepository;

    public HomeController(DeviceRepository deviceRepository,LocationRepository locationRepository,SiteRepository siteRepository, TechnicianRepository technicianRepository, TicketRepository ticketRepository){
        this.deviceRepository = deviceRepository;
        this.locationRepository = locationRepository;
        this.siteRepository = siteRepository;
        this.technicianRepository = technicianRepository;
        this.ticketRepository = ticketRepository;
    }

    @GetMapping(value = {"/paginaInicial"})
    public String paginaInicial(){
        return "index";
    }

    @GetMapping(value = {"/tecnicos"})
    public String listaTecnicos(Model model){
        List<Technician> listaTecnicos = technicianRepository.findAll();
        model.addAttribute("listaTecnicos",listaTecnicos);
        return "listaTecnicos";
    }

    @GetMapping(value = {"/agregarForm"})
    public String formularioTecnico(){
        return "formAgregar";
    }

    @PostMapping(value = {"/agregarTecnico"})
    public String agregarTecnico(){
        return "redirect:/tecnicos";
    }
}
