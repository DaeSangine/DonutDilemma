/**
 * Title: Donut Dilemma
 * Author: Lachlan Byrne
 * Date: 11/10/2023
 * Version: 1.0
 * Purpose: Year 12 CSC project, making a game in javascript.
 */


import java.util.Scanner;
import java.util.ArrayList;

class DonutDilemma {

    /**
     * This function replaces the system.out.println command.
     * @param message String to print out.
     */
    public void print (String message) {
        System.out.println(message);
    }

    /**
     * This function is for the computer to choose spend/save
     * @return spend or save
     */
    public String friendGuess () {
        if (Math.random() > 0.5) {
            return "spend";
        } else {
            return "save";
        }
    }


    /**
     * This function is running the game.
     */
    public void playGame () {

        ArrayList<String> friendsChoice = new ArrayList<>();
        ArrayList<String> choices = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);

        // Get the username
        print("What is your name?");
        String userName = keyboard.nextLine();
        print("Welcome to my dilemma " + userName + "!");

        // Get the number of rounds
        int numberOfRounds = -1;
        do {
            print("How many rounds of the dilemma do you want to play?");
            String rounds = keyboard.nextLine();
            try {
                numberOfRounds = Integer.parseInt(rounds);
            }
            catch (Exception e) {
                print(rounds + " isn't a number, try again");
            }
            if (numberOfRounds < 1) {
                print("This is an invalid amount of rounds, please put a number that is 1 or above.");
                numberOfRounds = -1;
            }
        } while (numberOfRounds == -1);

        //Get money
        int money = (5*numberOfRounds-5);
        // Play the game
        print("Your friend and you are walking through a town when you come across a donut shop.\nOne of you is feeling a bit hungry so you end up going in.\nAt the register you can see up on a board that the donuts cost $5 each. You have $"+money+".");
        print("You are faced with a choice, do you spend the little money that you have on a donut, or do you save your money for something more important?");
        for (int i = 0; i<numberOfRounds; ++i) {
            if (money <= 0) {
                print("You have run out of money :(");
                break;
            }

            print("You have $"+money+" left. Spend/Save");
            String answer = keyboard.nextLine().toLowerCase();

            if (answer.equals("spend")) {
                print("You have chosen to buy a donut.");
                // Taking away money
                money -= 5;
                choices.add(answer);
            } else if (answer.equals("save")) {
                print("You have decided to save your money.");
                choices.add(answer+" ");
            } else {
                print("That wasn't one of the options, try again");
                i--;
                continue;
            }
            String friendsAnswer = friendGuess();

            if (friendsAnswer.equals("spend")) {
                print("Your friend has chosen to buy a donut.");
                friendsChoice.add(friendsAnswer);
            } else if (friendsAnswer.equals("save")) {
                print("Your friend has decided to save their money.");
                friendsChoice.add(friendsAnswer+" ");
            }
        }

        // Print out the results
        print("Here are the choices that you and the computer made");
        print(userName + "              " + "Your friend");
        for (int i = 0; i < choices.size(); i++) {
            print((i+1) + ": " + choices.get(i) + "         " + friendsChoice.get(i));
        }
    }


    /**
     * Create the object and run the game.
     * @param args Arguments to the program.
     */
    public static void main(String[] args) {
        DonutDilemma dd = new DonutDilemma();
        dd.playGame();
    }
}
