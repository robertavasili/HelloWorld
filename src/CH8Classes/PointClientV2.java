package CH8Classes;

public class PointClientV2 {
    public static void main (String args[]) {
        //instantiate a point object called p1 of type PointV2
        PointV2 p1 = new PointV2();
        System.out.println("p1: " + p1);
        p1.x = 3;
        p1.y = 6;
        System.out.println("p1': " + p1);
    }
}