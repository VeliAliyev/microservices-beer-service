package com.velialiyev.microservicesbeerservice.repositories;

import com.velialiyev.microservicesbeerservice.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
