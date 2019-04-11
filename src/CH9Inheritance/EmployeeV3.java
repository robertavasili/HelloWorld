//A class to represent employees in general (20page manual)
package CH9Inheritance;

public class EmployeeV3 {
    //state fields
    String name;
    int YOE;

    public EmployeeV3(String name, int YOE) {
        this.name = name;
        this.YOE = YOE;
    }

    public String getName() {
        return name;
    }

    public int getHours(){
        return 40;      //works 40 hours/week
    }

    public double getSalary() {
        return 50000.0;    //$50,000 / year
    }

    public int getVacationDays() {
        return 10;      //2 weeks' paid vacation
    }

    public String getVacationForm() {
        return "yellow";    //use the yellow form for leave
    }

    public int getYOE() {
        return YOE;
    }






}