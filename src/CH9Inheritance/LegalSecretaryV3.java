package CH9Inheritance;

public class LegalSecretaryV3 extends SecretaryV3 {

    public double getSalary() {
        return super.getSalary()+5000;    //$55,000 / year
    }

    public LegalSecretaryV3(String name, int YOE) {
        super(name, YOE);
    }

}