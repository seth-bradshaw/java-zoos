package com.lambdaschool.zoosmydudes.services;

import com.lambdaschool.zoosmydudes.models.Zoo;
import com.lambdaschool.zoosmydudes.repositories.ZooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value = "zooServices")
public class ZooServicesImpl implements ZooServices
{
    @Autowired
    ZooRepository zoorepos;

    @Transactional
    @Override
    public Zoo save(Zoo zoo)
    {
        return zoorepos.save(zoo);
    }

}
