package com.jandarbar.ws.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jandarbar.ws.entities.StateMaster;

@Repository
public interface StateRepository extends JpaRepository<StateMaster, Long>
{

}
