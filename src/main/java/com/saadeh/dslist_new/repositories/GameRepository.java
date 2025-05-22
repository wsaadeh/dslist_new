package com.saadeh.dslist_new.repositories;

import com.saadeh.dslist_new.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,Long> {
}
