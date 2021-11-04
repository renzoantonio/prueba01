package com.example.test.repository;

import com.example.test.model.Currency;
import com.example.test.model.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<Wallet, Integer> {

}
