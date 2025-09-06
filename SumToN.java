import java.util.Scanner;

public class SumToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        long N = sc.nextLong();
        if (N <= 0) {
            System.out.println("Enter a positive integer.");
        } else {
            long sum = N * (N + 1) / 2;
            System.out.println("Sum 1 to " + N + " = " + sum);
        }
        sc.close();
    }
}
