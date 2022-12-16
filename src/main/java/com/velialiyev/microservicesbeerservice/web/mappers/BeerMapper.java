package com.velialiyev.microservicesbeerservice.web.mappers;

import com.velialiyev.microservicesbeerservice.domain.Beer;
import com.velialiyev.microservicesbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = DateMapper.class)
public interface BeerMapper {
    BeerDto BeerToBeerDto(Beer beer);
    Beer BeerDtoToBeer(BeerDto beerDto);
}
