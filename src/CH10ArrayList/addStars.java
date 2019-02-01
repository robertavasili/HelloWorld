package CH10ArrayList;

import java.util.ArrayList;

public class addStars {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("the");
        list.add("quick");
        list.add("brown");
        list.add("fox");
        System.out.print(list);
        addStars(list);
        System.out.print(list);
    }

    public static void addStars(ArrayList<String> list) {
        for(int i = 1; i <=  list.size(); i+=2) {
            list.add(i, "*");
        }
    }
}
