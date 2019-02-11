
    import java.util.Random;
    import java.util.Scanner;
   public class newassign {
       public static void main(String args[]) {
           Random rand = new Random();
           int secretNum = rand.nextInt(10) + 1;
           int guess;
           String Guess;

           Scanner keyboard = new Scanner(System.in);
           System.out.println("I have chosen a number between 1 and 10. Try to guess it");
           guess = keyboard.nextInt();
           do {

               if (guess == secretNum) {
                   System.out.println(" your guess");
               } else {
                   System.out.println("That is incorrect. Guess again.");

               }
           }while(guess!= secretNum);
       }
   }






