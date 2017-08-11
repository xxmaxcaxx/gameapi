package br.com.fernandohenry.gameapi.repository;

import br.com.fernandohenry.gameapi.model.Player;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlayerRepository extends
        MongoRepository<Player, String>{

}
