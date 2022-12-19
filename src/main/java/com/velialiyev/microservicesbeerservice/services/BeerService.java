package com.velialiyev.microservicesbeerservice.services;

import com.velialiyev.microservicesbeerservice.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {

    BeerDto getById(UUID id);
    BeerDto saveNewBeer(BeerDto beerDto);
    BeerDto updateBeer(UUID id, BeerDto beerDto);

}
