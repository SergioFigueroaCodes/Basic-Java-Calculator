import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String again = "yes";
        while (again.equalsIgnoreCase("yes")) {

            System.out.println(" enter first number:");
            while (!input.hasNextDouble()) {
                System.out.println("Invalid input: Please enter a number:");
                input.next();
            }
            double num1 = input.nextDouble();

            System.out.println(" enter second number:");
            while (!input.hasNextDouble()) {
                System.out.println("Invalid input : Please enter a number:");
                input.next();
            }
            double num2 = input.nextDouble();

            // operation selections that accepts symbols and numbers

            System.out.println("Choose operation: + - * /");
            System.out.println(" You can also type: Add, Subtract, Multiply, Divide ");
            String operation = input.next();
            double result = 0;
            boolean validOperation = true;

            if (operation.equals("+") || operation.equalsIgnoreCase("Add")) {
                result = num1 + num2;
            } else if (operation.equals("-") || operation.equalsIgnoreCase("Subtract")) {
                result = num1 - num2;
            } else if (operation.equals("*") || operation.equalsIgnoreCase("Multiply")) {
                result = num1 * num2;
            } else if (operation.equals("/") || operation.equalsIgnoreCase("Divide")) {
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero ");
                    validOperation = false;
                } else {
                    result = num1 / num2;
                }
            } else {
                System.out.println("Invalid operation.");
                validOperation = false;
            }

                if (validOperation) {
                    System.out.println("Result: " + result);
                }

                System.out.println(" Do you want to calculate again? Yes or No ");
                again = input.next();

            }
                System.out.println("Calculator closed. ");
                input.close();
        }

    }