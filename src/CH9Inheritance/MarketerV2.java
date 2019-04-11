package CH9Inheritance;

public class MarketerV2 extends EmployeeV1{
    public double getSalary() {
        return super.getSalary() +10000; //$50,000 / year
    }
    public void advertise() {
        System.out.println("I'll convince you to hire our law firm");
    }
}