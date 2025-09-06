import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: "); double x = sc.nextDouble();
        System.out.print("Enter second number: "); double y = sc.nextDouble();
        System.out.print("Enter operator (+ - * /): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+': System.out.println("Result: " + (x + y)); break;
            case '-': System.out.println("Result: " + (x - y)); break;
            case '*': System.out.println("Result: " + (x * y)); break;
            case '/':
                if (y == 0) System.out.println("Error: Division by zero");
                else System.out.println("Result: " + (x / y));
                break;
            default: System.out.println("Unknown operator");
        }
        sc.close();
    }
}
