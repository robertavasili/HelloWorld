package CH9Inheritance;

public class SecretaryV3 extends EmployeeV3 {


    public void takeDictation(String text) {
        System.out.println("Taking dictation of "
                + " text: " + text);
    }

    public SecretaryV3(String name, int YOE) {
        super(name, YOE);
    }

}