package com.test.jwt.authen.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "diplome")
public class Diplome {

	@Id
	private String id;
	private String libelle;
	private int annee;
	@DBRef
	private Etudiant impetrant;
	
	public Diplome() {
		super();
	}

	public Diplome(String id, String libelle, int annee, Etudiant impetrant) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.annee = annee;
		this.impetrant = impetrant;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public Etudiant getImpetrant() {
		return impetrant;
	}

	public void setImpetrant(Etudiant impetrant) {
		this.impetrant = impetrant;
	}

	@Override
	public String toString() {
		return "Diplome [id=" + id + ", libelle=" + libelle + ", annee=" + annee + ", impetrant=" + impetrant + "]";
	}
	
	
}
