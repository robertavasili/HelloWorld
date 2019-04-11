package CH9Inheritance;

public class LawyerV2 extends EmployeeV1 {
    //inherit methods form the Employees class
    //override the inherited methods from the Employee class

    public int getVacationDays() {
        return 15; //2 weeks paid vacation
    }

    public String getVacationForm() {
        return "pink"; //use the pink form for leave
    }
    public void sue() {
        System.out.println("I'll see you in court!");
    }
}