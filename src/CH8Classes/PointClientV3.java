package CH8Classes;

import java.awt.*;

public class PointClientV3 {
    public static void main (String args[]) {
        //instantiate a point object called p1 of type PointV2
        PointV3 p1 = new PointV3(1,5);
        System.out.println("p1: " + p1);
;

        PointV3 p2 = new PointV3(3,6);
        System.out.println("p2: " + p2);


        PointV3 p3 = new PointV3(); //p3 should be at (0,0)
        System.out.println("p3: " + p3);


    }
}