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
        System.out.println("Your friend and you are walking through a town when you come across a lone donut place.");
        System.out.println("");
    }
}

