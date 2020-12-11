package com.lambdaschool.zoosmydudes.repositories;

import com.lambdaschool.zoosmydudes.models.Telephone;
import org.springframework.data.repository.CrudRepository;

public interface TelephoneRepository extends CrudRepository<Telephone, Long>
{
    Telephone save(Telephone telephone);
}
