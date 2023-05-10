package com.gustavo.gplist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gustavo.gplist.dto.GameListDTO;
import com.gustavo.gplist.entities.GameList;
import com.gustavo.gplist.repositories.GameListRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository repository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> result = repository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
	}
}
