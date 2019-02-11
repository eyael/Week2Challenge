
    import java.util.Random;
    import java.util.Scanner;
   public class newassign {
       public static void main(String args[]) {
           Random rand = new Random();
           int secretNum = 1+rand.nextInt(10);
           int guess;
           String Guess;

           Scanner keyboard = new Scanner(System.in);
          do {System.out.println("I have chosen a number between 1 and 10. Try to guess it");
           guess = keyboard.nextInt();


               System.out.println(" your guess");
                   if (guess == secretNum) {
                       System.out.println("Thats right! you're a good guesser");
               } else {
                   System.out.println("That is incorrect. Guess again.");

               }
           }while(guess!= secretNum);
       }
   }






