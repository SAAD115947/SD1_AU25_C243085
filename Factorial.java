import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial not defined for negative numbers.");
        } else {
            if (n > 20) {
                System.out.println("Result will overflow long for n > 20. Use BigInteger for larger n.");
            } else {
                long fact = 1;
                for (int i = 1; i <= n; i++) fact *= i;
                System.out.println(n + "! = " + fact);
            }
        }

        sc.close();
    }
}
