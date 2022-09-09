package com.devsuperior.dsMeta.services;

import com.devsuperior.dsMeta.entities.Sale;
import com.devsuperior.dsMeta.repositories.SalesRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SalesServices {

    private SalesRepository repository;

    public List<Sale> findSales(){
       return  repository.findAll();
    }

}
