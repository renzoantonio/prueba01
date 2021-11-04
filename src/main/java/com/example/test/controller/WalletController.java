package com.example.test.controller;

import com.example.test.model.Currency;
import com.example.test.model.Wallet;
import com.example.test.service.CurrencyService;
import com.example.test.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WalletController {

    @Autowired
    WalletService walletService;

    @PostMapping("wallet")
    public ResponseEntity<Object> save(@RequestBody Wallet wallet){
        return ResponseEntity.ok(this.walletService.save(wallet));
    }
}
