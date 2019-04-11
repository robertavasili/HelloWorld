//This program is a client program to instantiate
//bunch of employees for a law firm
package CH9Inheritance;

public class MyLawFirm {
    public static void main(String[] args) {
        EmployeeV1 tom = new LegalSecretaryV2();
        EmployeeV1 johnny = new MarketerV2();
        EmployeeV1 henry = new LawyerV2();

        printInfo(tom);
        printInfo(johnny);
        printInfo(henry);
    }

    public static void printInfo(EmployeeV1 employee) {
        System.out.println("salary: " + employee.getSalary());
        System.out.println("v. days: " + employee.getVacationDays());
        System.out.println("v form: " + employee.getVacationForm());
    }
}
