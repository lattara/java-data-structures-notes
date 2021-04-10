package UNIT1;

public class Recursion {
    public static void main(String[] args) {
        // method that calls itself
        System.out.println(fact(5));
    }

    // factorial 5! number that gets multiplied with all the numbers before it except the 0
    // factorial of 5  5!=5*4*3*2*1

    public static long fact(long n) {
        if (n <= 0)
            return 1;
        else
            return n * fact(n-1);

    }
}
