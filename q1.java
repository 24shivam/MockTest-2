public class q1 {
    public static int mySqrt(int x) {
        if (x == 0)
            return 0;

        long left = 1;
        long right = x;

        while (left <= right) {
            long mid = (left + right) / 2;
            long square = mid * mid;

            if (square == x)
                return (int) mid;
            else if (square < x)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return (int) right;
    }

    public static void main(String[] args) {
        int x1 = 4;
        int x2 = 8;

        int sqrt1 = mySqrt(x1);
        int sqrt2 = mySqrt(x2);

        System.out.println("Square root of " + x1 + ": " + sqrt1);
        System.out.println("Square root of " + x2 + ": " + sqrt2);
    }
}
