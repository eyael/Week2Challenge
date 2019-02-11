import java.util.Random;
import java.util.Scanner;

public class IffyLoopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //  Random input = new Random();
        String response = "";
        boolean redEyes;

        //String[] Loopy = {"Red", "Yellow", "Blue", "Orange", "Pink"};
        for (int i = 1; i <= 5; i++) {
            int Loppyv = input.nextInt(5);


            do {
                System.out.println("Are your Eyes red?");
                response = sc.nextLine();
                if (response.equalsIgnoreCase("y")) {
                    System.out.println("Get some sleep!");
                }else
                    System.out.println("You look great");

                System.out.println("Do you want to try again?");
                redEyes =sc.nextBoolean();



            }while(response.equalsIgnoreCase("n"));
            System.out.println("n");
        }
    }
}
