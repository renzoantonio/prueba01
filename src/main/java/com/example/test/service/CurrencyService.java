package com.example.test.service;

import com.example.test.model.Currency;
import com.example.test.repository.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurrencyService {
    @Autowired
    CurrencyRepository currencyRepository;

    public Currency save(Currency currency){
        return this.currencyRepository.save(currency);
    }

}
