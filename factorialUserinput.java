import java.util.Scanner;

public class factorialUserinput {

      public static void main(String args[]) {
          Scanner userFactorial = new Scanner(System.in);
          System.out.println("Enter a number to calculate it's factorial");
          int number = userFactorial.nextInt();
          int fact = 1;
          while (number > 1) {
              fact = fact * number;
              number--;
          }
          System.out.println(fact);
      }
  }
