package com.example.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dslist.repositories.GameRepository;
import com.example.dslist.dto.GameMinDto;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    public List<GameMinDto> findAll(){
        List<GameMinDto> gamesDto = repository.findAll().stream().map(obj -> new GameMinDto(obj)).toList();
        
        return gamesDto;
    }
    
}
