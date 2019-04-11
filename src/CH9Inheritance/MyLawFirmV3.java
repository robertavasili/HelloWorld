//This program is a client program to instantiate
//bunch of employees for a law firm. This version
//uses an array of objects of the type Employees. Each
//object is created directly at the instantiation of the
//employee array. The array is then passed to a method to
//print each employee's information.
package CH9Inheritance;

public class MyLawFirmV3 {
    public static void main(String[] args) {
        EmployeeV3[] myEmployees = {new LegalSecretaryV3("Tom", 15),
                new MarketerV3("Jonny", 5),
                new LawyerV3("Henry", 10)};
        printInfo(myEmployees);
    }

    public static void printInfo(EmployeeV3[] employee) {
        //Datatype   //iterator //container
        for (EmployeeV3 staff : employee) {
            System.out.println("name: " + staff.getName());
            System.out.println("exp: " + staff.getYOE());
            System.out.println("salary: " + staff.getSalary());
            System.out.println("v. days: " + staff.getVacationDays());
            System.out.println("v form: " + staff.getVacationForm());
            System.out.println();
        }
        /*
        for (int i = 0; i < employee.length; i++) {
            System.out.println("salary: " + employee[i].getSalary());
            System.out.println("v. days: " + employee[i].getVacationDays());
            System.out.println("v form: " + employee[i].getVacationForm());
            System.out.println();
        }
        */

    }

}