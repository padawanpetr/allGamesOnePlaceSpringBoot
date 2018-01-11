package cz.home.controller;

import cz.home.dao.GameRepository;
import cz.home.entity.GameEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by padaw on 11.1.2018.
 */
@Controller
@RequestMapping("/")
public class GameController {


    @Autowired
    private GameRepository gameRepository;

//    public List<GameEntity> getAllGames() {
//        return gameRepository.findAll();
//    }

    @GetMapping("/test")
    public void getAllGames() {
        List<GameEntity> gameEntities = gameRepository.findAll();
        gameEntities.stream().forEach(gameEntity -> System.out.println(gameEntity.getGame_name()));
    }

}
