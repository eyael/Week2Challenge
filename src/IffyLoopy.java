import java.util.Random;
import java.util.Scanner;

public class IffyLoopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random input = new Random();
        String response = "";
        boolean redEyes;

        //String[] Loopy = {"Red", "Yellow", "Blue", "Orange", "Pink"};
        // for (int i = 1; i <= 5; i++) {
        do {
            System.out.println("Are your Eyes red?");
            response = sc.nextLine();
            if (response.equalsIgnoreCase("y")||(response.equalsIgnoreCase("yes"))) {
                System.out.println("Get some sleep!");
            }else
                System.out.println("You look great");

            System.out.println("Do you want to try again? ..press (any key to continue)..press(NO|N) to exit");
            response = sc.nextLine();
            if(response.equalsIgnoreCase("NO")||(response.equalsIgnoreCase("N"))){
                System.out.println("Thanks you gonna exit");
                System.exit(0);
            }
    }while(true);
    }
}














