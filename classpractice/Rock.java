import java.util.Scanner;
import java.util.Random;

public class Rock{
    public static void main(String[] args){
         Scanner s = new Scanner(System.in);
         Random ram = new Random();

         String[] choice ={"rock","paper","scissor"}; 


    System.out.println("Enter the Player1: ");
       String player1 = s.nextLine().toLowerCase();

       String Player2 = choice[ram.nextInt(choice.length)];

       if(isInvalidChoice(player1)&&isInvalidChoice(Player2)){
        System.out.println("Please enter valid choice, Rock,paper,scissor");
       }

       else if(player1.equals(Player2)){
        System.out.println("Its! a tie");
       }

       else if(player1.equals("rock") && Player2.equals("scissor") || player1.equals("paper") && player1.equals("rock") || player1.equals("scissor") && Player2.equals("paper")){
        System.out.println("Player 1! Wins");
       }

       else{
        System.out.println("Player2! Wins");
       }

       s.close();
        
    }

    private static boolean isInvalidChoice(String choice){
        return !choice.equals("rock")&& !choice.equals("paper") && !choice.equals("scissor");
    }
}