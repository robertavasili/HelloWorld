package CH8Classes;
// This class is a template to represent
// a point on the cartesian coordinate
public class PointV1 {
    //state fields below
    public int x;
    public int y;

    //behaviors below (methods)
    //mutator (setter) methods below
    public void translate(int dx, int dy){
        x = x + dx; // x+=dx;
        y = y + dy; // y+=dy;


    }
    public void setLocation(int newX, int newY) {
        x = newX;
        y = newY;
    }

    //getter(accessor) methods below
    public double distance(PointV1 other) {
        int dx = x - other.x;
        int dy = y - other.y;
        double answer = Math.sqrt((dx * dx) + (dy * dy));
        return answer;
    }

    public double distanceFromOrigin() {
        return Math.sqrt((x * x) + (y * y));
    }
}