package com.test.jwt.authen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.EntityResponse;

import com.test.jwt.authen.entity.Etudiant;
import com.test.jwt.authen.service.EtudiantService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/ecole/")
public class EtudiantController {
	
	@Autowired 
	private EtudiantService etudiantSer;
	
	@GetMapping("/etudiants")
	public EntityResponse<Flux<Etudiant>> getliste(){
		return (EntityResponse<Flux<Etudiant>>) EntityResponse.fromPublisher(etudiantSer.getListe(), Etudiant.class);
	}
	
	@GetMapping("/etudiants/{id}")
	public EntityResponse<Mono<Etudiant>> getElement(@PathVariable(value = "id") String id){
		return (EntityResponse<Mono<Etudiant>>) EntityResponse.fromPublisher(etudiantSer.getElement(id), Etudiant.class);
	}
	
	@PostMapping("/etudiants")
	public Mono<Etudiant> ajouter(@RequestBody Etudiant et){
		return etudiantSer.ajouter(et);
	}
	
	@PutMapping("/etudiants/{id}")
	public Mono<Etudiant> modifier(@PathVariable String id, @RequestBody Mono<Etudiant> et){
		return etudiantSer.modifier(id, et);
	}

	@DeleteMapping("/etudiants/{id}")
	public Mono<Void> supprimer(@PathVariable String id){
		return etudiantSer.supprimer(id);
	}
}
