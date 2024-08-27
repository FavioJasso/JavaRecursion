/*
 * @author Favio Valentino Jasso 
 * Data Structures and Algorithms
 * Professor : Bamford
 * Last Modified : 2.26.2024
 */

public class Recursion {

    public static void main(String[] args) {
        //This assigns results to our functions and prints them out

        int result = f1(8, 12);
        System.out.println("Function 1: f(8,12) ->  " + result);

        result = f2(f2(f2(f2(f2(10)))));
        System.out.println("Function 2: f(f(f(f(f(10))))) ->  " + result);

        result = f3(30, 12);
        System.out.println("Function 3: f(30,12) ->  " + result);

        result = f4(32);
        System.out.println("Function 4: f(32) ->  " + result);

        result = f5(5);
        System.out.println("Function 5: f(5) ->  " + result);

        result = f6(35, 8);
        System.out.println("Function 6: f(35,8) ->  " + result);

        result = sumOfF(10);
        System.out.println("Function 7: sumOfF(10) ->  " + result);

        result = f8(f8(f8(f8(18))));
        System.out.println("Function 8: f(f(f(f(18)))) ->  " + result);
    }
    //These are the functions that we are solving for

    /**
     * @param x
     * @param y
     * @return
     */
    public static int f1(int x, int y) {
        if (x < y) {
            return f1(x + 1, y - 2) + 3;
        } else if (x == y) {
            return x * x + y * y;
        } else {
            return f1(y - 1, x) - 1;
        }
    }

    /**
     * @param x
     * @return x + 5 
     */
    public static int f2(int x) {
        if (x > 7)
            return f2(x - 5) - 3;
        else if (3 < x && x <= 7)
            return f2(x + 2) + 2;
        else
            return x + 5;
    }

    /**
     * @param x
     * @param y
     * @return x * y
     */
    public static int f3(int x, int y) {
        if (x > y)
            return Math.max(f3(x - 4, y + 3), f3(y, x));
        return x * y;
    }

    /**
     * @param x
     * @return x * x - 3
     */
    public static int f4(int x) {
        if (x % 2 == 0)
            return f4(x / 2 - 1) + 3;
        else if (x % 2 != 0 && x > 1)
            return 2 * f4(x - 3) - 5;
        else
            return x * x - 3;
    }

    /**
     * @param n
     * @return 8
     * @return 2 * f5(n - 1) - 4
     */
    public static int f5(int n) {
        if (n == 1) {
            return 8;
        } else {
            return 2 * f5(n - 1) - 4;
        }
    }

    /**
     * @param x
     * @param y
     * @return x * x - y
     */
    public static int f6(int x, int y) {
        if (x >= y)
            return f6(x - y, y + 2) + y;
        else if (x < y)
            return x * x - y;
        return -1;
    }

    /**
     * Calculates the value of f7 for a given integer n.
     * 
     * @param n the input integer
     * @return the value of f7 for the given integer
     */
    public static int f7(int n) {
        if (n == 1) {
            return 1;
        } else {
            return f7(n - 1) + 5;
        }
    }

    /**
     * Calculates the sum of the values returned by the method f7 for the numbers from 1 to n.
     *
     * @param n the upper limit of the range
     * @return the sum of the values returned by f7
     */
    public static int sumOfF(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += f7(i);
        }
        return sum;
    }

    /**
     * @param x
     * @return 
     */
    public static int f8(int x) {
        if (x >= 10)
            return f8(x - 5) - 2;
        else if (7 <= x && x < 10)
            return f8(x + 4) + 6;
        else
            return x - 4;
    }
}
/*
Function 1: f(8,12) ->  136
Function 2: f(f(f(f(f(10))))) ->  7
Function 3: f(30,12) ->  396
Function 4: f(32) ->  10
Function 5: f(5) ->  68
Function 6: f(35,8) ->  41
Function 7: sumOfF(10) ->  235
Function 8: f(f(f(f(18)))) ->  -6
 * 
 */