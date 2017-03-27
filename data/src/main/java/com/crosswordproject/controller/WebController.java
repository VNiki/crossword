package com.crosswordproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.crosswordproject.model.Crossword;
import com.crosswordproject.repository.CrosswordRepository;

@RestController
public class WebController {
	
	@Autowired
	CrosswordRepository repository;
	
	@RequestMapping("/save")
	public String process(){
		repository.save(new Crossword(1, "horizontal", "Fußstütze am Sattel", "Steigbuegel"));
		repository.save(new Crossword(2, "vertical", "Sportler", "Turner"));
		repository.save(new Crossword(3, "vertical", "keiner", "niemand"));
		repository.save(new Crossword(4, "vertical", "schweiz. Schlagersängerin (Beatrice)", "Egli"));
		repository.save(new Crossword(5, "vertical", "alberner Streich", "Unfug"));
		repository.save(new Crossword(6, "vertical", "menschenleer, verlassen", "oed"));
		repository.save(new Crossword(7, "vertical", "Fluss durch Hamburg", "Elbe"));
		repository.save(new Crossword(8, "vertical", "rumänische Währung(Mz.)", "Lei"));
		repository.save(new Crossword(9, "horizontal", "berühmte Person(Kw.)", "Promi"));
		repository.save(new Crossword(10, "horizontal", "große Not", "Elend"));
		repository.save(new Crossword(11, "vertical", "Salz der Ölsäure", "Oleat"));
		repository.save(new Crossword(12, "vertical", "Messer der Schuster", "Kneif"));
		repository.save(new Crossword(13, "horizontal", "Kimonogürtel", "Obi"));
		repository.save(new Crossword(14, "horizontal", "Weitung, Vergrößerung", "Dehnung"));
		repository.save(new Crossword(15, "vertical", "Stadt in Hessen", "Hanau"));
		repository.save(new Crossword(16, "horizontal", "Mulde", "Kuhle"));
		repository.save(new Crossword(17, "vertical", "griechisches Fabelwesen", "Zentaur"));
		repository.save(new Crossword(18, "vertical", "den Brennpunkt betreffend", "Fokal"));
		repository.save(new Crossword(19, "vertical", "unterzeichnen", "signieren"));
		repository.save(new Crossword(20, "vertical", "stechen(ugs.)", "piken"));
		repository.save(new Crossword(21, "horizontal", "abgeschrägte Kante", "Fase"));
		repository.save(new Crossword(22, "horizontal", "Abstufung", "Grad"));
		repository.save(new Crossword(23, "vertical", "Denkansatz, Lehrmeinun", "Theorie"));
		repository.save(new Crossword(24, "horizontal", "Flugzeugführerin", "Pilotin"));
		repository.save(new Crossword(25, "horizontal", "Preistabelle", "Tarif"));
		repository.save(new Crossword(26, "vertical", "betrachten", "sehen"));
		repository.save(new Crossword(27, "horizontal", "Kfz.-Z.: Gütersloh", "GT"));
		repository.save(new Crossword(28, "vertical", "slawischer Volksangehöriger", "Sorbe"));
		repository.save(new Crossword(29, "horizontal", "finn. Heißluftbad", "Sauna"));
		repository.save(new Crossword(30, "horizontal", "Eulenart", "Uhu"));
		repository.save(new Crossword(31, "horizontal", "Gewürzpflanze", "Sesel"));
		repository.save(new Crossword(32, "vertical", "Hanfabfall", "Hede"));
		repository.save(new Crossword(33, "horizontal", "Form des Sauerstoffs", "Ozon"));
		repository.save(new Crossword(34, "vertical", "französisch: Ende", "Fin"));
		repository.save(new Crossword(35, "horizontal", "hin und ...", "her"));
		repository.save(new Crossword(36, "horizontal", "Schweine fleischspeise", "Eisbein"));
		repository.save(new Crossword(37, "vertical", "italienisch: ja", "Si"));
		repository.save(new Crossword(38, "horizontal", "Verbrennung, Brand", "Feuer"));
		repository.save(new Crossword(39, "horizontal", "französisch: oder", "ou"));
		repository.save(new Crossword(40, "horizontal", "Körperspray (Kurzwort)", "Deo"));
		repository.save(new Crossword(41, "horizontal", "unrund laufen", "eiern"));
		repository.save(new Crossword(42, "horizontal", "Speisefolge(Schweiz)", "Menu"));
		return "Done";
	}
	
	 @RequestMapping("/findall")
	    public String findAll(){
	        String result = "<html>";
	         
	        for(Crossword cross : repository.findAll()){
	            result += "<div>" + cross.toString() + "</div>";
	        }
	         
	        return result + "</html>";
	    }
	     
	 @RequestMapping("/findbyid")
	    public String findById(@RequestParam("id") long id){
	        String result = "";
	        result = repository.findOne(id).toString();
	        return result;
	    }
	     
	    @RequestMapping("/findbystate")
	    public String fetchDataByState(@RequestParam("state") String state){
	        String result = "<html>";
	         
	        for(Crossword cross: repository.findByState(state)){
	            result += "<div>" + cross.toString() + "</div>"; 
	        }
	         
	        return result + "</html>";
	    }
	    
	    @RequestMapping("/findbydefinition")
	    public String fetchDataByDefinition(@RequestParam("definition") String definition){
	    	String result = "<html>";
	    	
	    	for(Crossword cross: repository.findByDefinition(definition)){
	    		result += "<div>" + cross.toString() + "</div>";
	    	}
	    	
	    	
	    	return result + "</html>";
	    }

}
