package CH9Inheritance;

public abstract class ShapeV2 implements Comparable {
    public abstract double area();
    public abstract double perimeter();

    @Override
    public int compareTo(Object o) {
        if(o instanceof ShapeV2) {
            ShapeV2 s = (ShapeV2)o;
            return (int) (this.area()-s.area());
        }
        return -1;
    }
}
