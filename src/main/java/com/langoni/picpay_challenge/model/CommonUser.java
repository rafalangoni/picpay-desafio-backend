package com.langoni.picpay_challenge.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class CommonUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private String cpf;
    private String password;
    private String email;

    //TODO verify relationship between entities
    private Wallet wallet;

    private String transferMoney(Double value) {
        return "Value transferred: " + value;
    }

}
