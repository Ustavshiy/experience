package com.courses.apollo.model.bank;

/**
 * Client class.
 */
public class Client {
    /**
     * Client name.
     */
    private String name;
    /**
     * Deposit account.
     */
    private DepositAccount depositAccount;

    public Client() {
    }

    public Client(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DepositAccount getDepositAccount() {
        return depositAccount;
    }

    public void setDepositAccount(DepositAccount depositAccount) {
        this.depositAccount = depositAccount;
    }
}
