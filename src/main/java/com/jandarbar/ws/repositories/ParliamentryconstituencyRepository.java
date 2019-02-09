package com.jandarbar.ws.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jandarbar.ws.entities.Parliamentryconstituency;

@Repository
public interface ParliamentryconstituencyRepository extends JpaRepository<Parliamentryconstituency	, Long>
{

}
