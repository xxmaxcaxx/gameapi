package br.com.fernandohenry.gameapi.Controller;

import br.com.fernandohenry.gameapi.model.Player;
import br.com.fernandohenry.gameapi.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerController {

    @Autowired
    PlayerRepository playerRepository;

    @GetMapping(value = "/")
    public List<Player> findAll(){
        return playerRepository.findAll();
    }

    @PostMapping (value = "/")
    public void salvar(@RequestBody Player player) {
        playerRepository.save(player);
    }

}
