package com.example.test.service;

import com.example.test.model.Currency;
import com.example.test.model.Wallet;
import com.example.test.repository.CurrencyRepository;
import com.example.test.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WalletService {
    @Autowired
    WalletRepository walletRepository;

    public Wallet save(Wallet wallet){
        return this.walletRepository.save(wallet);
    }

}
