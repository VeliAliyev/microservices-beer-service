package com.velialiyev.microservicesbeerservice.repositories;

import com.velialiyev.microservicesbeerservice.domain.Beer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID>, JpaRepository<Beer, UUID> {
}
