package com.devsuperior.dsMeta.services;

import com.devsuperior.dsMeta.entities.Sale;
import com.devsuperior.dsMeta.repositories.SalesRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

@Service
public class SalesServices {

    @Autowired
    private SalesRepository repository;

    public Page<Sale> findSales(String minDate, String maxDate,Pageable pageable){

        LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());

        LocalDate min = minDate.equals("") ? today.minusDays(365) : LocalDate.parse(minDate);
        LocalDate max = maxDate.equals("") ? today : LocalDate.parse(maxDate);

        return repository.findSales(min, max, pageable);
    }

}
