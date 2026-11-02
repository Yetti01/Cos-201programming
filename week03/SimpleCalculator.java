import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double firstNumber = input.nextDouble();
        System.out.print("Enter second number: ");
        double secondNumber = input.nextDouble();
        System.out.printf("Sum: %.2f%n", firstNumber + secondNumber);
        System.out.printf("Difference: %.2f%n", firstNumber - secondNumber);
        System.out.printf("Product: %.2f%n", firstNumber * secondNumber);
        if (secondNumber != 0) {
            System.out.printf("Quotient: %.2f%n", firstNumber / secondNumber);
        } else {
            System.out.println("Cannot divide by zero.");
        }
        input.close();
    }
}
