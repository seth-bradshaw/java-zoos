package com.lambdaschool.zoosmydudes.repositories;

import com.lambdaschool.zoosmydudes.models.ZooAnimals;
import com.lambdaschool.zoosmydudes.models.ZooAnimalsId;
import org.springframework.data.repository.CrudRepository;

public interface ZooAnimalRepository extends CrudRepository<ZooAnimals, ZooAnimalsId>
{
}
