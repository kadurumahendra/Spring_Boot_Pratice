package com.SpringBootApp.Getter;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@ConfigurationProperties(prefix = "myapp")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Bank {

    private String bankName;
    private String branch;
    private Manager manager;
    private List<Account> accounts;
}
