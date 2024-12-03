package com.langoni.picpay_challenge.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private String cnpj;
    private String password;
    private String email;
    private Wallet wallet;

    private String receiveMoney(Double value) {
        return "Received value: " + value;
    }

}
