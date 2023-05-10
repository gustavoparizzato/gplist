package com.gustavo.gplist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavo.gplist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
