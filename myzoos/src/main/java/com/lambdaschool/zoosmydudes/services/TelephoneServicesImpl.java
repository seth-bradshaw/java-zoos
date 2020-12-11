package com.lambdaschool.zoosmydudes.services;

import com.lambdaschool.zoosmydudes.models.Telephone;
import com.lambdaschool.zoosmydudes.repositories.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value = "telephoneServices")
public class TelephoneServicesImpl implements TelephoneServices
{
    @Autowired
    AnimalRepository animalrepos;

    @Transactional
    @Override
    public Telephone save(Telephone telephone)
    {
        return animalrepos.save(telephone);
    }
}
