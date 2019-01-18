package CH10ArrayList;

import java.util.ArrayList;

public class IntroToArrayList {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<String>();
        System.out.println(students);
        students.add("Matt");
        System.out.println(students);
        students.add(0,"Jonny");
        System.out.println(students);
        students.add(0, "Aidan C");
        System.out.println(students);
        if(students.contains("Jonny")) {
            students.remove("Jonny");
        }
        System.out.println(students);
        for(int i = 0; i < students.size(); i++) {
            if(students.get(i).startsWith("M")) {
                System.out.println("A student with the letter M exists in the ArrayList");
            }
        }
    }
}
