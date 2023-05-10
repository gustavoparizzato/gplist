package com.gustavo.gplist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavo.gplist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
		
}
