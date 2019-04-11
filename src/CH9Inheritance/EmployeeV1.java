// A class to represent employee in general (20 page manual)
package CH9Inheritance;

public class EmployeeV1 {
    public int getHours() {
        return 40; //works 40 hours per week
    }
    public double getSalary() {
        return 40000.0; //$40,000 / year
    }
    public int getVacationDays() {
        return 10; //2 weeks paid vacation
    }
    public String getVacationForm() {
        return "yellow"; //use the yellow form for leave
    }

}