package com.SpringBootApp.Getter;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class Account {

    private int accNo;
    private String holderName;
    private double balance;
}
