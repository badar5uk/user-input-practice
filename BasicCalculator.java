import java.util.Scanner;

public class BasicCalculator {
    //Input: ask user to input 3=2 numbers ( 2 scanners)
    //Input: ask for operator
    //Process: use if statement
   public static Boolean exitSign = false;

    public static void main(String[] args) {
        while (exitSign == false) {
            int input = userInput();
            if (input == 5) {
                exit();
            } else {
                menuResolver(input);
            }
        }

    }
    public static int userInput() {
        System.out.print("Enter an option number:  " + "\n" + "Operator Options: " + "\n" + "1. Addition" + "\n" + "2. Subtraction" + "\n" + "3. Multiplication" + "\n" + "4. Division" + "\n" + "5. EXIT");
        Scanner operator = new Scanner(System.in);
        int operatorUserInput = operator.nextInt();
        return operatorUserInput;
    }

    public static int[] inputForCalculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First number:  ");
        int firstNumberEntered = scanner.nextInt();
        System.out.println("Enter Second number:  ");
        int secondNumberEntered = scanner.nextInt();
        int[] inputsArray = {firstNumberEntered, secondNumberEntered};
        return inputsArray;
    }

    public static int addition(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    public static int subtract(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }

    public static int divide(int num1, int num2) {
        int result = num1 / num2;
        return result;
    }

    public static int multiply(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }



    public static void menuResolver(int optionNumber) {


        int[] inputs = inputForCalculator();
        int firstNumber = inputs[0];
        int secondNumber = inputs[1];

        int finalResult = 0;

        if (optionNumber == 1) {
            finalResult = addition(firstNumber, secondNumber);
        } else if (optionNumber == 2) {
            finalResult = subtract(firstNumber, secondNumber);
        } else if (optionNumber == 3) {
            finalResult = divide(firstNumber, secondNumber);
        } else if (optionNumber == 4) {
            finalResult = multiply(firstNumber, secondNumber);
        } else {
            exit();
        }
        System.out.println("Your result is: " + finalResult);
    }
    public static void exit(){
        exitSign = true;

    }
}
