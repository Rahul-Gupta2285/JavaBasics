import java.util.*;

public class JavaBasics {
    // public static void half_pyramid(int n) {
    // System.out.println();
    // for (int i = 1; i <= n; i++) { // outer loop
    // for (int j = 1; j <= i; j++) { // inner loop
    // System.out.print("* ");
    // }
    // System.out.println();
    // }
    // }

    // public static void inverted_half_pyramid(int n) {
    // System.out.println();
    // for (int i = n; i >= 1; i--) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }
    // }

    // public static void half_pyramid_with_num(int n) {
    // System.out.println();
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print(j + " ");
    // }
    // System.out.println();
    // }
    // }

    // public static void inverted_half_pyramid_with_num(int n) {
    // System.out.println();
    // for (int i = n; i >= 1; i--) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print(j + " ");
    // }
    // System.out.println();
    // }
    // }

    // public static void half_pyramid_with_alphabets(int n) {
    // System.out.println();
    // char ch = 'A';
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print(ch + " ");
    // ch++;
    // }
    // System.out.println();
    // }
    // }

    // public static void half_pyramid_with_num_counter(int n) {
    // System.out.println();
    // int a = 1;
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print(a + " ");
    // a++;
    // }
    // System.out.println();
    // }
    // }

    // public static void inverted_rotated_half_pyramid(int n) {
    // System.out.println();
    // for (int i = 1; i <= n; i++) {
    // // spaces
    // for (int j = 1; j <= (n - i); j++) {
    // System.out.print(" ");
    // }
    // // stars
    // for (int j = 1; j <= i; j++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }
    // }

    // public static void triangle_0_1(int n) {
    // System.out.println();
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= i; j++) {
    // if ((i + j) % 2 == 0) {
    // System.out.print("1 ");
    // } else {
    // System.out.print("0 ");
    // }
    // }
    // System.out.println();
    // }
    // }

    // public static void solid_rectangle(int n) {
    // System.out.println();
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= n; j++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }
    // }

    // public static void butterfly(int n) {
    // System.out.println();
    // for (int i = 1; i <= n; i++) {
    // // stars
    // for (int j = 1; j <= i; j++) {
    // System.out.print("* ");
    // }
    // // spaces
    // for (int j = 1; j <= 2 * (n - i); j++) {
    // System.out.print(" ");
    // }
    // // spaces
    // for (int j = 1; j <= i; j++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }
    // for (int i = n; i >= 1; i--) {
    // // stars
    // for (int j = 1; j <= i; j++) {
    // System.out.print("* ");
    // }
    // // spaces
    // for (int j = 1; j <= 2 * (n - i); j++) {
    // System.out.print(" ");
    // }
    // // spaces
    // for (int j = 1; j <= i; j++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }
    // }

    // public static void hollow_rhombus(int n) {
    // System.out.println();
    // for (int i = 1; i <= n; i++) {
    // // spaces
    // for (int j = 1; j <= (n - i); j++) {
    // System.out.print(" ");
    // }
    // // stars
    // for (int j = 1; j <= n; j++) {
    // if (i == 1 || j == 1 || j == n || i == n) {
    // System.out.print("* ");
    // } else {
    // System.out.print(" ");
    // }
    // }
    // System.out.println();
    // }
    // }

    // public static void solid_rhombus(int n) {
    // System.out.println();
    // for (int i = 1; i <= n; i++) {
    // // spaces
    // for (int j = 1; j <= (n - i); j++) {
    // System.out.print(" ");
    // }
    // // stars
    // for (int j = 1; j <= n; j++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }
    // }

    // public static void diamond(int n) {
    // System.out.println();
    // for (int i = 1; i <= n; i++) {
    // // spaces
    // for (int j = 1; j <= (n - i); j++) {
    // System.out.print(" ");
    // }
    // // stars
    // for (int j = 1; j <= (2 * i) - 1; j++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }
    // for (int i = n; i >= 1; i--) {
    // // spaces
    // for (int j = 1; j <= (n - i); j++) {
    // System.out.print(" ");
    // }
    // // stars
    // for (int j = 1; j <= (2 * i) - 1; j++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }
    // }

    // public static void num_pyramid(int n) {
    // System.out.println();
    // for (int i = 1; i <= n; i++) {
    // // spaces
    // for (int j = 1; j <= (n - i); j++) {
    // System.out.print(" ");
    // }
    // // numbers
    // for (int j = 1; j <= i; j++) {
    // System.out.print(i + " ");
    // }
    // System.out.println();
    // }
    // }

    // public static void palindromic(int n) {
    // System.out.println();
    // for (int i = 1; i <= n; i++) {
    // // spaces
    // for (int j = 1; j <= (n - i); j++) {
    // System.out.print(" ");
    // }
    // // decending
    // for (int j = i; j >= 1; j--) {
    // System.out.print(j + " ");
    // }
    // // ascending
    // for (int j = 2; j <= i; j++) {
    // System.out.print(j + " ");
    // }
    // System.out.println();
    // }
    // }

    // public static int add(int a, int b) {
    // return (a + b);
    // }

    // public static float circle_area(int r) {
    // return (3.14f * r * r);
    // }

    // public static void swap(int a, int b) {
    // int temp = a;
    // a = b;
    // b = temp;
    // System.out.println("After swapping the values of a and b is " + a + " " + b);
    // }

    public static void swap_without_third(int a, int b) {
        a += b;
        b = a - b;
        a -= b;
        System.out.println("After swapping the values of a and b is " + a + " " + b);
    }

    // public static boolean isEven(int n) {
    // System.out.println();
    // if (n % 2 == 0) {
    // return true;
    // } else {
    // return false;
    // }
    // }

    // public static boolean isEven_v2(int n) {
    // System.out.println();
    // if ((n / 2) * 2 == n) {
    // return true;
    // } else {
    // return false;
    // }
    // }

    // public static void max_of_3(int a, int b, int c) {
    // if (a > b && a > c) {
    // System.out.println("a is greater");
    // } else if (b > c) {
    // System.out.println("b is greater");
    // } else {
    // System.out.println("c is greater");
    // }
    // }

    // public static void rev(int n) {
    // while (n > 0) {
    // int ld = n % 10;
    // System.out.print(ld);
    // n /= 10;
    // }
    // }

    // public static int rev_v2(int n) {
    // int rev = 0;
    // while (n > 0) {
    // int ld = n % 10;
    // rev = (rev * 10) + ld;
    // n /= 10;
    // }
    // return rev;
    // }

    // public static boolean isdiv_by_5(int n) {
    // if (n % 5 == 0) {
    // return true;
    // } else {
    // return false;
    // }
    // }

    // public static void printNtimes(int n) {
    // for (int i = 1; i <= n; i++) {
    // System.out.println("Rahul");
    // }
    // }

    // public static void pos_or_neg(int n) {
    // if (n > 0) {
    // System.out.println("Positive");
    // } else if (n == 0) {
    // System.out.println("Zero");
    // } else {
    // System.out.println("Negative");
    // }
    // }

    // public static void print_num(int n) {
    // System.out.println();
    // for (int i = 1; i <= n; i++) {
    // System.err.print(i + " ");
    // }
    // }

    // public static void div_by_10(int n) {
    // String div = (n % 10) == 0 ? "div by 10" : "Not div by 10";
    // System.out.println(div);
    // }

    // public static void week(int n) {
    // System.out.println();
    // switch (n) {
    // case 1:
    // System.out.println("Monday");
    // break;
    // case 2:
    // System.out.println("Tuesday");
    // break;
    // case 3:
    // System.out.println("Wednesday");
    // break;
    // case 4:
    // System.out.println("Thursday");
    // break;
    // case 5:
    // System.out.println("Friday");
    // break;
    // case 6:
    // System.out.println("Saturday");
    // break;
    // case 7:
    // System.out.println("Sunday");
    // break;
    // default:
    // System.out.println("Undefined");
    // }
    // }

    // public static void prime(int n) {
    // System.out.println();
    // int count = 0;
    // for (int i = 1; i <= n; i++) {
    // if (n % i == 0) {
    // count++;
    // }
    // }
    // if (count == 2) {
    // System.out.println("Prime");
    // } else {
    // System.out.println("Not Prime");
    // }
    // }

    // public static void leap_year(int n) {
    // if ((n % 400 == 0) || (n % 4 == 0 && n % 100 != 0)) {
    // System.out.println("Leap Year");
    // } else {
    // System.out.println("Not leap year");
    // }
    // }

    // public static void binary_to_decimal(int n) {
    // System.out.println();
    // int deci = 0, ld, pow = 0;
    // while (n > 0) {
    // ld = n % 10;
    // deci = deci + (ld * (int) Math.pow(2, pow));
    // n = n / 10;
    // pow++;
    // }
    // System.out.println(deci);
    // }

    // public static void decimal_to_binary(int n) {
    // System.out.println();
    // int bin = 0, r, pow = 0;
    // while (n > 0) {
    // r = n % 2;
    // bin = bin + (r * (int) Math.pow(10, pow));
    // n = n / 2;
    // pow++;
    // }
    // System.out.println(bin);
    // }
    public static int rev_v2(int n) {
        int rev = 0;
        while (n > 0) {
            int ld = n % 10;
            rev = (rev * 10) + ld;
            n /= 10;
        }
        return rev;
    }

    public static void dayWeek(int day) {
        System.out.println();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }

    public static void div10(int n) {
        System.out.println();
        String a;
        a = (n % 10) == 0 ? "Yes" : "No";
        System.out.println(a);
    }

    public static boolean isPrime(int n) {
        System.out.println();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if ((n % i) == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static void binary_to_decimal(int n) {
        System.out.println();
        int deci = 0, ld, pow = 0;
        while (n > 0) {
            ld = n % 10;
            deci += (ld * (int) Math.pow(2, pow));
            n = n / 10;
            pow++;
        }
        System.out.println(deci);
    }

    public static void decimal_to_binary(int n) {
        System.out.println();
        int bi = 0, ld;
        while (n > 0) {
            ld = n % 2;
            bi = (bi * 10) + ld;
            n = n / 2;
        }
        System.out.println(bi);
    }

    public static void printPrime(int n) {
        System.out.println();
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
            }
        }
    }

    public static void palindromic(int n) {
        System.out.println();
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // decending
            for (int j = i; j >= 1; j--) {
                System.out.print(j + "");
            }
            // ascending
            for (int j = 2; j <= i; j++) {
                System.out.print(j + "");
            }
            System.out.println();
        }
    }

    public static void hollow_rectangle(int n) {
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || j == n || i == n) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        System.out.println("Before swapping the values of a and b is " + a + " " + b);
        swap_without_third(a, b);
    }
}
