package com.gustavo.gplist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gustavo.gplist.dto.GameMinDTO;
import com.gustavo.gplist.entities.Game;
import com.gustavo.gplist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository repository;
	
	public List<GameMinDTO> findAll(){
		List<Game> result = repository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
}
