package com.jandarbar.ws.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jandarbar.ws.entities.PartyMaster;

@Repository
public interface PartyRespository extends JpaRepository<PartyMaster, Long>
{

}
