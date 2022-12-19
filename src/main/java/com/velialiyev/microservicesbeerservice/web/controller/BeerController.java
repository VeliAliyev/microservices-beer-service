package com.velialiyev.microservicesbeerservice.web.controller;

import com.velialiyev.microservicesbeerservice.services.BeerService;
import com.velialiyev.microservicesbeerservice.web.model.BeerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
@RequiredArgsConstructor
public class BeerController {

    private final BeerService beerService;

//    @GetMapping
//    public ResponseEntity<BeerPagedList> listBeers(){
//        return null;
//    }

    @GetMapping("/{uuid}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable UUID uuid){
        BeerDto found = beerService.getById(uuid);
        return new ResponseEntity<>(found, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity createNewBeer(@RequestBody @Validated BeerDto beerDto){

        BeerDto saved = beerService.saveNewBeer(beerDto);

        return new ResponseEntity(saved, HttpStatus.CREATED);
    }

    @PutMapping("/{uuid}")
    public ResponseEntity updateBeerById(@PathVariable UUID uuid, @RequestBody @Validated BeerDto beerDto){
        BeerDto updated = beerService.updateBeer(uuid, beerDto);
        return new ResponseEntity<>(updated, HttpStatus.NO_CONTENT);
    }
}
