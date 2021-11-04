package com.example.test.controller;

import com.example.test.model.Currency;
import com.example.test.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CurrencyController {

    @Autowired
    CurrencyService currencyService;

    @PostMapping("currency")
    public ResponseEntity<Object> save(@RequestBody Currency currency){
        return ResponseEntity.ok(this.currencyService.save(currency));
    }
}
