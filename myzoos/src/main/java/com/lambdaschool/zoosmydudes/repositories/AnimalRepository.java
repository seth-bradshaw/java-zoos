package com.lambdaschool.zoosmydudes.repositories;

import com.lambdaschool.zoosmydudes.models.Animal;
import com.lambdaschool.zoosmydudes.models.Telephone;
import org.springframework.data.repository.CrudRepository;

public interface AnimalRepository extends CrudRepository<Animal, Long>
{
    Animal save(Animal animal);

    Telephone save(Telephone telephone);
}
