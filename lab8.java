import java.util.Scanner;
// Earl Garner
// November 1, 2025
// Lab 8 

public class lab8{
    public static void main(String[] args){

        int MAX = 0;
        int low = 0;
        boolean found = false;
        int guesscount = 0;

        Scanner response = new Scanner(System.in);
        System.out.println("Largest number:");
        String input = response.nextLine();
        MAX = Integer.parseInt(input);
        System.out.println(MAX);
    
        MAX = 1000;
        low = 1;
        found = false;
        guesscount = 0;
        System.out.println("Think of a number between " + low + " and " + MAX + ".");
        System.out.println("I can guess your number in 10 tries or less.");
        
        while(!found){
            int guess = (low + MAX) / 2;
            guesscount++;
            System.out.println("Is your number " + guess + "?");
            input = response.nextLine();
             // Assume this method gets user input
            
            if(input.equalsIgnoreCase("correct")){
                found = true;
                System.out.println("Yay! I guessed your number in " + guesscount + " tries.");
            } else if(input.equalsIgnoreCase("higher")){
                low = guess + 1;
            } else if(input.equalsIgnoreCase("lower")){
                MAX = guess - 1;
            } else {
                System.out.println("Please respond with 'higher', 'lower', or 'correct'.");
            }
            if (guesscount > 10){
                System.out.println("I don't know your number!");
                System.out.println("What number were you thinking of?");
                input = response.nextLine();
                System.out.println("You were thinking of " + input + "!");
            }
        }
    }// end of main method
}
