// lab3a.java
// lehman
// fall 2025
// power and GCD recursive functions
//
public class lab3 {
    public static void main(String[] args) {

        // call to power function
        System.out.println(power(4, 5));
        System.out.println();
        System.out.println(power(3, 6));
        System.out.println();
        System.out.println(power(6, 10));
        System.out.println();

        
        // call to gcd function
        System.out.println(gcd(10, 75));
        System.out.println();
        System.out.println(gcd(100, 20));
        System.out.println();
        System.out.println(gcd(17, 31));
        System.out.println();

    }

    public static int power(int x, int y) {
        System.out.println("power(" + x + "," + y + ")");
        if (y == 0)
            return 1;
        else if (y == 1)
            return x;
        else
            return x * power(x, y - 1);
    }

    public static int gcd(int x, int y) {
        System.out.println("gcd(" + x + "," + y + ")");
        if (y == 0)
            return x;
        else
            return gcd(y, x % y);
    }

}
