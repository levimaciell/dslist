package com.example.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dslist.dto.GameListDto;
import com.example.dslist.dto.GameMinDto;
import com.example.dslist.services.GameListService;
import com.example.dslist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
    
    @Autowired
    private GameListService service;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDto> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}/games")
    public List<GameMinDto> findByList(@PathVariable Long id){
        return gameService.findByList(id);
    }


}
