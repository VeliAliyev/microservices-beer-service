package com.velialiyev.microservicesbeerservice.web.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BeerDto {
    @NotBlank
    private String beerName;
    @NotNull
    private BeerStyleEnum beerStyle;

    @NotNull
    @Positive
    private Long upc;
    private Integer quantityOnHand;

    @NotNull
    @Positive
    private BigDecimal price;

    @Null
    private UUID id;
    @Null
    private Integer version;
    @Null
    private OffsetDateTime createdDate;
    @Null
    private OffsetDateTime lastModifiedDate;
}
