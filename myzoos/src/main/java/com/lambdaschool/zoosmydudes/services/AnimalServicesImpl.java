package com.lambdaschool.zoosmydudes.services;

import com.lambdaschool.zoosmydudes.models.Animal;
import com.lambdaschool.zoosmydudes.repositories.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value = "animalServices")
public class AnimalServicesImpl implements AnimalServices
{
    @Autowired
    AnimalRepository animalrepos;

    @Transactional
    @Override
    public Animal save(Animal animal)
    {
        return animalrepos.save(animal);
    }

}
