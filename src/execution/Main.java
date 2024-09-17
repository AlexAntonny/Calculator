package execution;
import logic.Operation;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner1.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner1.nextDouble();

        Operation operation = new Operation(num1,num2);

        System.out.println("Choose an operation: ");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");

        int choice = scanner1.nextInt();
        double result;

        switch (choice) {
            case 1:
                result = operation.add();
                System.out.println("Result: " + result);
                break;
            case 2:
                result = operation.subtract();
                System.out.println("Result: " + result);
                break;
            case 3:
                result = operation.multiply();
                System.out.println("Result: " + result);
                break;
            case 4:
                result = operation.divide();
                if (!Double.isNaN(result)) {
                    System.out.println("Result: " + result);
                }
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner1.close();
    }
}