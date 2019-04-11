package CH9Inheritance;

public class LegalSecretaryV2 extends SecretaryV2{
    public double getSalary() {
        return super.getSalary()+ 5000.0; //$55,000 / year
    }
}