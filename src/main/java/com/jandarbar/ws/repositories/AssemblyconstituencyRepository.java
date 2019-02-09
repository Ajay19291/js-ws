package com.jandarbar.ws.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jandarbar.ws.entities.Assemblyconstituency;

@Repository
public interface AssemblyconstituencyRepository extends JpaRepository<Assemblyconstituency, Long>
{

}
