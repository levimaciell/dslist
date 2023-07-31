package com.example.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dslist.dto.GameListDto;
import com.example.dslist.repositories.GameListRepository;

@Service
public class GameListService {
    
    @Autowired
    private GameListRepository repository;

    @Transactional(readOnly = true)
    public List<GameListDto> findAll(){
        return repository.findAll().stream().map(x -> new GameListDto(x)).toList();
    }


}
