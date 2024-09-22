import java.util.Scanner; // Import the Scanner class

class userinput_evenorodd {
    public static void main(String args[]) {
        int userinp = 0;
        while (userinp >= 0) {
                Scanner in = new Scanner(System.in);
                System.out.println("Enter a positive Integer:  ");
                userinp = in.nextInt();
            if (userinp >= 0) {
                System.out.println("Your Number is: " + userinp);
            }
            else{
                System.out.println("Not positive");
            }
        }
    }
}
