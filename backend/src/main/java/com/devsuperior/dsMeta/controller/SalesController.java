package com.devsuperior.dsMeta.controller;

import com.devsuperior.dsMeta.services.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import com.devsuperior.dsMeta.services.SalesServices;
import com.devsuperior.dsMeta.entities.Sale;

@RestController
@RequestMapping(value = "/sales")
public class SalesController {
    @Autowired
    private SalesServices salesServices;
    @Autowired
    private SmsService smsService;

@GetMapping
   public Page<Sale> findSales(
           @RequestParam(value="minDate", defaultValue = "") String minDate,
           @RequestParam(value="maxDate", defaultValue = "") String maxDate,
           Pageable pageable){
       return salesServices.findSales(minDate, maxDate,pageable);
   }

    @GetMapping("/{id}/notification")
    public void notifySms(@PathVariable Long saleId){
    smsService.sendSms(saleId);
    }

}
