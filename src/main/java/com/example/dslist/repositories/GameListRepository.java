package com.example.dslist.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.dslist.entities.GameList;
import com.example.dslist.projections.GameMinProjection;

@Repository
public interface GameListRepository extends JpaRepository<GameList, Long>{
    
}
