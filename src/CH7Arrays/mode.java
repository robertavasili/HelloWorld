package CH7Arrays;

public class mode {
    public static void main(String[] args) {
        int number = 669260267;
        System.out.println("Mode is: " + badMode(number));
    }

    //Michael's algorithm
    public static int badMode(int num) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        int count7 = 0;
        int count8 = 0;
        int count9 = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit == 0) {
                count0++;
            } else if (digit == 1) {
                count1++;
            } else if (digit == 2) {
                count2++;
            } else if (digit == 3) {
                count3++;
            } else if (digit == 4) {
                count4++;
            } else if (digit == 5) {
                count5++;
            } else if (digit == 6) {
                count6++;
            } else if (digit == 7) {
                count7++;
            } else if (digit == 8) {
                count8++;
            } else if (digit == 9) {
                count9++;
            }

            num = num / 10;
        }
        int max1 = Math.max(count0, Math.max(count1, Math.max(count2, count3)));
        int max2 = Math.max(count4, Math.max(count5, Math.max(count6, count7)));
        int max3 = Math.max(count8, count9);

        int maxFinal = Math.max(max1, Math.max(max2, max3));

        if (maxFinal == count0) {
            return 0;
        } else if (maxFinal == count1) {
            return 1;
        } else if (maxFinal == count2) {
            return 2;
        } else if (maxFinal == count3) {
            return 3;
        } else if (maxFinal == count4) {
            return 4;
        } else if (maxFinal == count5) {
            return 5;
        } else if (maxFinal == count6) {
            return 6;
        } else if (maxFinal == count7) {
            return 7;
        } else if (maxFinal == count8) {
            return 8;
        } else {
            return 9;
        }

    }
}
