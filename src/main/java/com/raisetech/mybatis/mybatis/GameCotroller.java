package com.raisetech.mybatis.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GameCotroller {

    @Autowired
    GameMapper gameMapper;

    @GetMapping("/games")
    public List<Game> games() {
        List<Game> gameList = gameMapper.findAll();
        return gameList;
    }
}
