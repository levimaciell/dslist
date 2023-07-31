package com.example.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dslist.dto.GameDto;
import com.example.dslist.dto.GameMinDto;
import com.example.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    
    @Autowired
    private GameService service;

    @GetMapping()
    public List<GameMinDto> findAll(){
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public GameDto findById(@PathVariable Long id){
        return service.findById(id);
    }




}
