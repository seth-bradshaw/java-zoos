package com.lambdaschool.zoosmydudes.repositories;

import com.lambdaschool.zoosmydudes.models.Zoo;
import org.springframework.data.repository.CrudRepository;

public interface ZooRepository extends CrudRepository<Zoo, Long>
{
    Zoo save(Zoo zoo);
}
