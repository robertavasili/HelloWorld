package CH8Classes;

public class PointClientV5 {
    public static void main (String args[]) {
        //instantiate a point object called p1 of type PointV2
        PointV5 p1 = new PointV5(3,6);
        System.out.println("p1: " + p1);
;

        PointV5 p2 = new PointV5(3,6);
        System.out.println("p2: " + p2);


        PointV5 p3 = new PointV5(); //p3 should be at (0,0)
        System.out.println("p3: " + p3);

        System.out.println(p1.equals(4));


    }
}