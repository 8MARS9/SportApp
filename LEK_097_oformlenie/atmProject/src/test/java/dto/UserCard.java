package dto;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class UserCard {

        public final UUID id;
        private final Date expiryDate;
        private  double balance;
        private int pin;
        private final long cardNumber;

    public UserCard(UUID id, Date expiryDate, double balance, int pin, long cardNumber) {
        this.id = UUID.randomUUID();
        this.expiryDate = expiryDate;
        this.balance = balance;
        this.pin = pin;
        this.cardNumber = this.generateCardNumber();
    }

    private long generateCardNumber() {
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(10);
    }

    public UserCard(Date expiryDate, double balance, int pin) {
        this.expiryDate = expiryDate;
        this.balance = balance;
        this.pin = pin;
        this.id = UUID.randomUUID();
        this.cardNumber = generateCardNumber();
    }


    public UserCard(Date expiryDate, double balance, int pin, long cardNumber) {
        this.id = UUID.randomUUID();
        this.expiryDate = expiryDate;
        this.balance = balance;
        this.pin = pin;
        this.cardNumber = cardNumber;
    }

    public UUID getId() {
        return id;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public boolean isPinValid(int cardPin) {
        return this.pin == cardPin;
    }
}
