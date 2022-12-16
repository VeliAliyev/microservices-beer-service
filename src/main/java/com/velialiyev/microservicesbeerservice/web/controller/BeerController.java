package com.velialiyev.microservicesbeerservice.web.controller;

import com.velialiyev.microservicesbeerservice.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

//    @GetMapping
//    public ResponseEntity<BeerPagedList> listBeers(){
//        return null;
//    }

    @GetMapping("/{uuid}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable UUID uuid){
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity createNewBeer(@RequestBody @Validated BeerDto beerDto){
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{uuid}")
    public ResponseEntity<String> updateBeerById(@PathVariable UUID uuid, @RequestBody @Validated BeerDto beerDto){
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
