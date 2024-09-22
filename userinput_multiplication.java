import java.util.Scanner;

public class userinput_multiplication {
    //test
    //
    public static void main(String args[]) {
        int userinp = 0;
        int[] multiplicationarray = {1,2,3,4,5,6,7,8,9,10};
        int display;
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a number:  ");
            userinp = in.nextInt();
            for (int array1: multiplicationarray){
                display = array1 * userinp;
                System.out.println(display);
            }
        }
    }
