package com.velialiyev.microservicesbeerservice.services.impl;

import com.velialiyev.microservicesbeerservice.domain.Beer;
import com.velialiyev.microservicesbeerservice.repositories.BeerRepository;
import com.velialiyev.microservicesbeerservice.services.BeerService;
import com.velialiyev.microservicesbeerservice.web.mappers.BeerMapper;
import com.velialiyev.microservicesbeerservice.web.model.BeerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class BeerServiceImpl implements BeerService {

    private final BeerRepository beerRepository;
    private final BeerMapper beerMapper;

    @Override
    public BeerDto getById(UUID id) {
        return beerRepository.findById(id).map(beerMapper::beerToBeerDto).orElseThrow();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        Beer saved = beerRepository.save(beerMapper.beerDtoToBeer(beerDto));
        return beerMapper.beerToBeerDto(saved) ;
    }

    @Override
    public BeerDto updateBeer(UUID id, BeerDto beerDto) {
        Beer found = beerRepository.findById(id).orElseThrow();
        found.setBeerName(beerDto.getBeerName());
        found.setBeerStyle(beerDto.getBeerStyle().toString());
        found.setPrice(beerDto.getPrice());
        found.setUpc(beerDto.getUpc());
        return beerMapper.beerToBeerDto(beerRepository.save(found));
    }
}
