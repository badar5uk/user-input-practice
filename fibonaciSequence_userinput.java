import java.util.Scanner;
import java.io.*;

public class fibonaciSequence_userinput {
    //Fibonacci sequence is calculated by adding the sum of the two previous numbers so  Fn = Fn-1 + Fn-2
    //start by assigning first numebr as 0 and second as 1
    //User is asked to input a number
    //user input is taken
    // the index value would be used to print the number digits stored in the array

        public static void main (String[]args){
            int fibNum1 = 0;
            int fibNum2 = 1;
            System.out.println("Please enter a number in the Fibonacci sequence");
            Scanner userInp = new Scanner(System.in);
            int n = userInp.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.print(fibNum1 + " ");
                int fibNum3 = fibNum2 + fibNum1;
                fibNum1 = fibNum2;
                fibNum2 = fibNum3;
            }
            System.out.println("\n"+"Are the outputs for the first" + n +" numbers of the Fibonacci sequence");
        }
    }
