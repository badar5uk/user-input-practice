import java.util.Scanner;
import java.util.Random;

public class guessingGame {
    //The player has to guess a random number
    // use a scanner to ask user input number
    //while loop to make it run until number is guessed
    //output says "too high" or "too low"'
    static Boolean exitSign = false;
    static Random rand = new Random();
    public static int count = 0;
   public static int randomNum = rand.nextInt(100 ) + 1;
    public static void main(String[] args) {
        while (exitSign == false) {
            int input = userInputfun();
            if (input == randomNum) {
                System.out.println("You are correct, the answer is: " + randomNum);
                exit();
            } else {
                userInputfun();

            }
        }
    }

    public static int userInputfun() {
        System.out.println("I am thinking of a number" + "\n" + "Can you guess what the number is? " + "\n");
        Scanner userInp = new Scanner(System.in);
        int enteredNumber = userInp.nextInt();
        if (enteredNumber > randomNum) {
            System.out.println("My Number is lower");
            count++;
            System.out.println("Number of attempts: " + count);
        } else if (enteredNumber < randomNum) {
            System.out.println("My Number is higher");
            count++;
            System.out.println("Number of attempts: " + count);

        }
        return enteredNumber;
    }
    public static void exit() {
        exitSign = true;
    }
}


