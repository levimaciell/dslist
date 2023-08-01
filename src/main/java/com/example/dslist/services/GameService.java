package com.example.dslist.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dslist.repositories.GameRepository;
import com.example.dslist.dto.GameDto;
import com.example.dslist.dto.GameMinDto;
import com.example.dslist.entities.Game;
import com.example.dslist.projections.GameMinProjection;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    @Transactional(readOnly = true)
    public List<GameMinDto> findAll(){
        List<GameMinDto> gamesDto = repository.findAll().stream().map(obj -> new GameMinDto(obj)).toList();
        
        return gamesDto;
    }

    @Transactional(readOnly = true)
    public GameDto findById(Long id){ 
        Optional<Game> optional = repository.findById(id);
       
        return new GameDto(optional.get()); 
    }

    @Transactional(readOnly = true)
    public List<GameMinDto> findByList(Long id){
        List<GameMinProjection> games = repository.searchByList(id);
        return games.stream().map(x -> new GameMinDto(x)).toList(); 
    }
    
}
