package CH8Classes;

public class Dob {
    private final int day;
    private final int month;
    private final int year;


    public Dob(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}
