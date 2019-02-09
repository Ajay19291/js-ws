package com.jandarbar.ws.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.jandarbar.ws.entities.QuestionMaster;

@Repository
public interface QuestionMasterRepository extends JpaRepository<QuestionMaster, Long>
{

}
