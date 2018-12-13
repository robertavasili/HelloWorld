package CH8Classes;

public class BankAccountV1 {
    //state fields below
    private double balance;
    private int pin;
    private String name;
    private String ssn;
    private String address;
    private String dob;


    //behaviors below
    public BankAccountV1(String name, String ssn, String address, String dob) {
        this.name = name;
        this.ssn = ssn;
        this.address = address;
        this.dob = dob;

    }

    public BankAccountV1(String name, String ssn, String address, String dob,
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

    public String getAddress() {
        return address;
    }

    public String getDob() {
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

    //print the object
    public String toString() {

    }


}

