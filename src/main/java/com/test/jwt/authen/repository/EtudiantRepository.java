package com.test.jwt.authen.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.test.jwt.authen.entity.Etudiant;

@Repository
public interface EtudiantRepository extends ReactiveMongoRepository<Etudiant, String> {

}
