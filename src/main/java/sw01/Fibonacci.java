package main.java.sw01;

public class Fibonacci {

    public static int[] fibsq;

    public static int fibRec1(int n) {
        if (n == 0)
            return 0;
        else  if (n == 1)
            return 1;
        else
            return fibRec1(n - 1) + fibRec1(n - 2);
    }


    public static int fibIter(int n) {
        int x = 0, y = 1, z = 1;
        for (int i = 0; i < n; i++) {
            x = y;
            y = z;
            z = x + y;
        }
        return x;
    }
}
