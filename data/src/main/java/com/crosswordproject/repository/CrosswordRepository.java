package com.crosswordproject.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.crosswordproject.model.Crossword;

public interface CrosswordRepository extends CrudRepository<Crossword, Long>{
	List<Crossword> findByState(String state);
	List<Crossword> findByDefinition(String definition);
}
