package com.langoni.picpay_challenge.model;

import jakarta.persistence.Entity;
import lombok.Getter;

@Entity
@Getter
public class Wallet {

    private Double balance;

}
