package com.devsuperior.dsMeta.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.AllArgsConstructor;
import com.devsuperior.dsMeta.services.SalesServices;
import com.devsuperior.dsMeta.entities.Sale;
import java.util.List;

@RestController
@RequestMapping(value = "/sales")
@AllArgsConstructor
public class SalesController {

    private SalesServices salesServices;

    @GetMapping
    public List<Sale> findSales(){
        return salesServices.findSales();
    }


}
