package com.saadeh.dslist_new.services;

import com.saadeh.dslist_new.dto.GameMinDTO;
import com.saadeh.dslist_new.entities.Game;
import com.saadeh.dslist_new.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List<GameMinDTO> listDto = new ArrayList<>();
        List<Game> result = gameRepository.findAll();
        return result.stream().map(game -> new GameMinDTO(game)).toList();
    }
}
