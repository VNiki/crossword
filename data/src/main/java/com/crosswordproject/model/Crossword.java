package com.crosswordproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "crossword")
public class Crossword {
	
	@Id
	private long id;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "definition")
	private String definition;
	
	@Column(name = "answer")
	private String answer;
	
	public Crossword(){
		
	}

	public Crossword(long id, String state, String definition, String answer) {
		this.id = id;
		this.state = state;
		this.definition = definition;
		this.answer = answer;
	}

	@Override
	public String toString() {
		return String.format("Crossworditem[id=%d, state='%s', definition='%s', answer='%s',']",
				id, state, definition, answer);
	}
	
	

}
