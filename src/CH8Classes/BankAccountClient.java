package CH8Classes;

public class BankAccountClient {
    public static void main(String[] args) {
        BankAccountV1 henry = new BankAccountV1( "Henry Eaton", "123456789",
                 "1 Rochelle Road",  "09062001", 1000000, 0000);
        BankAccountV1 matt = new BankAccountV1( "Matthew Scheiderman", "456789123",
                "123 Sesame St",  "11012001");
        matt.deposit(500000);
        System.out.println(matt);
    }
}
