package CH8Classes;
// This class is a template to represent
// a point on the cartesian coordinate and contrains constructors
//This version overrides the object Class' equals method
public class PointV5 {
    //state fields below (variables)
    public int x;
    public int y;

    //constructors below
    //A constructor does NOT have a return type
    //it gets called implicitly when an object is created
    public PointV5(int initialX, int initialY) {
        x = initialX;
        y = initialY;
    }

    public PointV5 () {
        x = 0;
        y = 0;
    }

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

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    //getter(accessor) methods below
    public double distance(PointV3 other) {
        int dx = x - other.x;
        int dy = y - other.y;
        double answer = Math.sqrt((dx * dx) + (dy * dy));
        return answer;
    }

    public double distanceFromOrigin() {
        return Math.sqrt((x * x) + (y * y));
    }

    public boolean equals(Object other) {
        if(other instanceof PointV5){
            PointV5 p = (PointV5) other;
            return this.getX() == p.getX() && this.getY() == p.getY();
        }
        return false;
    }

    //we're overriding the object's built-in toString() method
    //to print the contents of the object instead of its location
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}