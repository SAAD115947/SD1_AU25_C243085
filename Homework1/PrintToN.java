import java.util.Scanner;

public class PrintToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        if (N <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            for (int i = 1; i <= N; i++) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
