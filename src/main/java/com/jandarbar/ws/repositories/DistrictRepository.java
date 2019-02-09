package com.jandarbar.ws.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jandarbar.ws.entities.DistrictMaster;

@Repository
public interface DistrictRepository extends JpaRepository<DistrictMaster, Long>
{

}
