package dto;

import java.util.Random;
import java.util.UUID;

public class User {
    private final UUID id;
    private String name;
    private String accountNumber;
    private UserCard card;

    private double transactionFee;

    public User(String name, String accountNumber, UserCard card, double transactionFee) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.card = card;
        this.transactionFee = transactionFee;
        this.id = UUID.randomUUID();
    }

    public User(String name, UserCard card, double transactionFee) {
        this.accountNumber = String.valueOf(new Random().nextInt(1000));
        this.name = name;
        this.card = card;
        this.transactionFee = transactionFee;
        this.id = UUID.randomUUID();
    }

    public User(UUID id, String name, String accountNumber, UserCard card, double transactionFee) {
        this.accountNumber = String.valueOf(new Random().nextInt(5));
        this.id = id;
        this.name = name;
        this.accountNumber = accountNumber;
        this.card = card;
        this.transactionFee = transactionFee;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public UserCard getCard() {
        return card;
    }

    public void setCard(UserCard card) {
        this.card = card;
    }

    public double getTransactionFee() {
        return transactionFee;
    }

    public void setTransactionFee(double transactionFee) {
        this.transactionFee = transactionFee;
    }
}
