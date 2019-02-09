package com.jandarbar.ws.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jandarbar.ws.entities.CandidateGallery;

@Repository
public interface CandidateGalleryRepository extends JpaRepository<CandidateGallery, Long>
{
	public List<CandidateGallery> findByFkCandidateId(Long fkCandidateId);

	public List<CandidateGallery> findByFkCandidateIdAndMediaOption(Long candidateId, String mediaOption);
}
