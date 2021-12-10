package com.test.jwt.authen.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.test.jwt.authen.entity.Diplome;

@Repository
public interface DiplomeRepository extends MongoRepository<Diplome, String> {

}
