import java.util.Arrays;
import java.util.Scanner; // Import the Scanner class


public class sumOfDigits {
    public static void main(String args[]) {
        //positive 3 digit integer entered by user (while loop)
        //convert the input into a string and then into characters
        //convert characters back into integers and sum them
        int enteredvalue = 0;
        do {
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter a 3 digit integer");
            enteredvalue = myObj.nextInt();
            int sum = String.valueOf(enteredvalue).chars().map(Character::getNumericValue).sum();
            System.out.println("The sum of the individual digits of " + enteredvalue + " is equal to:  " + sum);
        } while (enteredvalue != 0);
    }
}