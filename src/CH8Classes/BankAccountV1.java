package CH8Classes;

import com.sun.jndi.cosnaming.IiopUrl;

public class BankAccountV1 {
    //state fields below
    private double balance;
    private int pin;
    private String name;
    private String ssn;
    private Address address;
    private Dob dob;


    //behaviors below
    public BankAccountV1(String name, String ssn, Address address, Dob dob) {
        this.name = name;
        this.ssn = ssn;
        this.address = address;
        this.dob = dob;

    }

    public BankAccountV1(String name, String ssn, Address address, Dob dob,
                         double balance, int pin) {
        this.name = name;
        this.ssn = ssn;
        this.address = address;
        this.dob = dob;
        this.balance = balance;
        this.pin = pin;
    }

    //getters
    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public Address getAddress() {
        return address;
    }

    public Dob getDob() {
        return dob;
    }

    public double getBalance() {
        return balance;
    }

    public int getPin() {
        return pin;
    }

    //setters (mutators)
    public void deposit(double cash) {
        balance += cash;
    }

    public void withdrawal(double amount) {
        balance -= amount;
    }

    //print the object by overriding the object's built in
    //toString() method
    public String toString() {
        return "Name: " + name + "\nBalance: " + balance;
    }


}

