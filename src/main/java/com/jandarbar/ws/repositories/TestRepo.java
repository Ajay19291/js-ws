package com.jandarbar.ws.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.jandarbar.ws.entities.UserInfo;

@Repository
public interface TestRepo extends PagingAndSortingRepository<UserInfo, Long>
{

}
