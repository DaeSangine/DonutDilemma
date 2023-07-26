import java.util.Scanner;
class DonutDilemma {
    public static void print (String message) {
        System.out.println(message);
    }


    public void playGame () {

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
        } while (numberOfRounds == -1);

        // Play the game
        print("Your friend and you are walking through a town when you come across a donut shop.\nOne of you is feeling a bit hungry so you end up going in.\nAt the register you can see up on a board that the donuts cost $8 each.");
        for (int i = 0; i<numberOfRounds; ++i) {
            print("You are faced with a choice, do you spend the little money that you have on a donut, or do you save your money for something more important? Spend/Save");
            String answer = keyboard.nextLine().toLowerCase();

            if (answer.equals("spend")) {
                print("You have chosen to buy the donut.");
            } else if (answer.equals("save")) {
                print("You have decided to save your money.");
            } else {
                print("That wasn't one of the options, try again");
            }
        }
    }


    public static void main(String[] args) {
        DonutDilemma
    }
}
