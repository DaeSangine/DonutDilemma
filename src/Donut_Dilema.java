import java.util.Scanner;
class DonutDilemma
{
    // instance variables - replace the example below with your own

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your name?"); // asking name
        // some code from w3s
        String userName = keyboard.nextLine();
        System.out.println("Welcome to my dilemma " + userName); // getting username
        System.out.println("Your friend and you are walking through a town when you come across a donut place.\nOne of you is feeling a bit hungry so you end up going in.\nAt the register you can see up on a board that the donuts cost $8 each.");

    }
}

