package CH8Classes;

public class BankAccountClient {
    public static void main(String[] args) {
        //Address henrysAddress = new Address(1, "Rochelle Rd.", "Larchmont", "NY", 10538,
                //"United States");
        //Dob henrysDob = new Dob(6, 9, 2001);
        BankAccountV1 henry = new BankAccountV1( "Henry Eaton", "123456789",
                new Address(1, "Rochelle Rd.", "Larchmont", "NY", 10538,
                        "United States"),  new Dob(6, 9, 2001), 1000000, 0000);
       // BankAccountV1 matt = new BankAccountV1( "Matthew Scheiderman", "456789123",
       //         "123 Sesame St",  "11012001");
        henry.deposit(500000);
        System.out.println(henry);
        henry.withdrawal(200);
        System.out.println(henry);
    }
}
