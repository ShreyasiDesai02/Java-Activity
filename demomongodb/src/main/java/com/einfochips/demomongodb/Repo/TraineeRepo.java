package com.einfochips.demomongodb.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.einfochips.demomongodb.Model.Trainee;

@Repository
public interface TraineeRepo extends MongoRepository<Trainee,Integer> {
	@Query("select count(t) from Trainee t")
	int countTrainee();
}
