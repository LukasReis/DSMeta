package com.devsuperior.dsMeta.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.AllArgsConstructor;
import com.devsuperior.dsMeta.services.SalesServices;
import com.devsuperior.dsMeta.entities.Sale;

@RestController
@RequestMapping(value = "/sales")
@AllArgsConstructor
public class SalesController {

    private SalesServices salesServices;
@GetMapping
   public Page<Sale> findSales(
           @RequestParam(value="minDate", defaultValue = "") String minDate,
           @RequestParam(value="maxDate", defaultValue = "") String maxDate,
           Pageable pageable){
       return salesServices.findSales(minDate, maxDate,pageable);
   }

}
