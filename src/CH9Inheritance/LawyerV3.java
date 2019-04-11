package CH9Inheritance;

public class LawyerV3 extends EmployeeV3{
    //inherit methods from the Employees class

    public LawyerV3(String name, int YOE) {
        super(name, YOE);
    }

    //override the inherited methods from the Employee class
    public int getVacationDays() {
        return 15;      //3 weeks' paid vacation
    }

    public String getVacationForm() {
        return "pink";    //use the pink form for leave
    }

    public void sue() {
        System.out.println("I'll see you in court!");
    }


}