import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int rngNum, inputNum, currGuess;
        final int maxGuess = 3;
        String playAgain = "y";

        Scanner scan = new Scanner(System.in);
        Random generate = new Random();
        rngNum = 1 + generate.nextInt(51); // 1 to 50

        while (playAgain.equals("y"))
        {
            System.out.println("We have generated a number for you. Please input your guess in the range of 1 to 50.");
            System.out.println("If you wish to exit, input '0'");

            currGuess = 0;
            inputNum= -1;

            try{
                inputNum = Integer.parseInt(scan.nextLine());
            } catch (Exception e)
            {
                System.out.println("Please input a number");
            }


            while(inputNum != 0)
            {
                currGuess++;
                if (inputNum == rngNum) {
                    System.out.println("You have guessed the right number. Congrats! :)");
                    break;
                }
                else if (inputNum < rngNum) {
                    System.out.println("The number we are looking for is higher.");
                }
                else if (inputNum > rngNum) {
                    System.out.println("The number we are looking for is lower.");
                }
                //
                if (currGuess == maxGuess){
                    System.out.println("You have reached the guess limit. The number was " + rngNum);
                    break;
                }

                System.out.println("Please enter your next guess");
                try{
                    inputNum = Integer.parseInt(scan.nextLine());
                } catch (Exception e)
                {
                    System.out.println("Please input a number");
                }

            }
            System.out.println("_____________________");
            System.out.println("If you want to play again, input 'y'");
            playAgain = scan.nextLine();

        }
        System.out.println("Thank you for playing! :)");
    }
}