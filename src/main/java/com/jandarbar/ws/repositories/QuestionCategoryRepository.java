package com.jandarbar.ws.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jandarbar.ws.entities.QuestionCategory;


@Repository
public interface QuestionCategoryRepository extends JpaRepository<QuestionCategory, Long>
{

}
