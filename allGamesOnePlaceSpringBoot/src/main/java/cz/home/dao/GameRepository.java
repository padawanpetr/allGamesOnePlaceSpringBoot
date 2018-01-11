package cz.home.dao;

import cz.home.entity.GameEntity;
import cz.home.model.GameModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by padaw on 11.1.2018.
 */
@Repository
public interface GameRepository extends JpaRepository<GameEntity, Long> {

}
