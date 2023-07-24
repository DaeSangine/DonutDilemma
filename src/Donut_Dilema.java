import java.util.Scanner;
class DonutDilemma {
    // instance variables - replace the example below with your own

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your name?"); // asking name
        // some code from w3s
        String userName = keyboard.nextLine();
        System.out.println("Welcome to my dilemma " + userName + "!"); // getting username
        int numberOfRounds = -1;
        do {
            System.out.println("How many rounds of the dilemma do you want to play?");
            String rounds = keyboard.nextLine();
            try {
                numberOfRounds = Integer.parseInt(rounds);
            }
            catch (Exception e) {
                System.out.println(rounds + " isn't a number, try again");

            }
        } while (numberOfRounds == -1);
        System.out.println("Your friend and you are walking through a town when you come across a donut shop.\nOne of you is feeling a bit hungry so you end up going in.\nAt the register you can see up on a board that the donuts cost $8 each.");
        for (int i = 0; i<numberOfRounds; ++i) {
            System.out.println("You are faced with a choice, do you spend the little money that you have on a donut, or do you save your money for something more important? Spend/Save");
            String answer = keyboard.nextLine().toLowerCase();

            if (answer.equals("spend")) {
                System.out.println("So you have chosen the donut.");//Placeholder
            } else if (answer.equals("save")) {
                System.out.println("You are now hungry.");//Placeholder
            } else {
                System.out.println("That wasn't one of the options, try again");
            }
        }
    }
}
