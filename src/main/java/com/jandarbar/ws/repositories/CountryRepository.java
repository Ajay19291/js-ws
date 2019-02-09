package com.jandarbar.ws.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jandarbar.ws.entities.CountryMaster;

@Repository
public interface CountryRepository extends JpaRepository<CountryMaster, Long>
{

}
