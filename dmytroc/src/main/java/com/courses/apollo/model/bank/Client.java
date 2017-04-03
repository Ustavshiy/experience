package com.courses.apollo.model.bank;

/**
 * Created by Dell on 01.04.2017.
 */
public class Client {
    private String Name;
    private DepositAccount depositAccount;

    public Client() {
    }

    public Client(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public DepositAccount getDepositAccount() {
        return depositAccount;
    }

    public void setDepositAccount(DepositAccount depositAccount) {
        this.depositAccount = depositAccount;
    }
}
