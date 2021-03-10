
// Import Scanner class
import java.util.Scanner;

//Public class
public class LottoNumbers
{

    // checks to make sure the numbers are within range
    public static int inRange(int number, int min, int max)
    {

        while(number < min)
        {
            number += max;
        }

        while(number > max)
        {
            number -= max;
        }

        return number;
    }

    // main
    public static void main(String[] args)
    {
        // Sets input as new scanner; Asks for user's name; Greets user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.next();
        System.out.println("Hello, " + name + ".");

        // begins do-while loop for starting again
        do
        {
            // Asks user questions; converts answer to lowercase; checks to see if answer
            // begins with 'y'; error checks with check1
            System.out.println("Would you like to continue the interactive portion?  Yes or No");
            String answer = input.next().toLowerCase();
            char value = answer.charAt(0);

            // If user wants to continue with the interactive portion...
            if(value == 'y')
            {
                System.out.println("Do you have a red car?  Yes or No");
                String question1 = input.next().toLowerCase();
                boolean check1 = question1.matches(".*\\d.*");

                if(check1)
                {
                    System.out.println("Invalid Operation.  Please try again.");
                    break;
                }

                System.out.println("What is the name of your favorite pet?");
                String question2 = input.next().toLowerCase();
                boolean check2 = question1.matches(".*\\d.*");

                if(check2)
                {
                    System.out.println("Invalid Operation.  Please try again.");
                    break;
                }

                System.out.println("What is the age of your favorite pet?");
                int question3 = input.nextInt();

                System.out.println("What is your lucky number?");
                int question4 = input.nextInt();

                System.out.println("Do you have a favorite quarterback?  What is their jersey number?");
                int question5 = input.nextInt();
                
                System.out.println("What is the two digit model year of your car?");
                int question6 = input.nextInt();

                System.out.println("What is the first name of your favorite actor or actress?");
                String question7 = input.next().toLowerCase();
                boolean check7 = question1.matches(".*\\d.*");

                if(check7)
                {
                    System.out.println("Invalid Operation.  Please try again.");
                    break;
                }

                System.out.println("Enter a random number between 1 and 50.");
                int question8 = input.nextInt();

                // Lotto & Magic Ball Numbers

                // Calculates random numbers
                double randomNumber1 = Math.floor(Math.random() * (65 - 1 + 1) + 1);
                double randomNumber2 = Math.floor(Math.random() * (65 - 1 + 1) + 1);
                double randomNumber3 = Math.floor(Math.random() * (65 - 1 + 1) + 1);

                // Magic Ball - question 4's answer multiplied by a random number; converts to
                // int
                double magicBallDouble = question4 * randomNumber1;
                int magicBall = (int) magicBallDouble;

                // Magic Number 1 - Car year + lucky number
                int magicNumber1 = question4 + question6;

                // Magic Number 2 - The number 42
                int magicNumber2 = 42;

                // Magic Number 3 - Age of Favorite Pet + Car Model Year
                int magicNumber3 = question3 + question6;

                // Magic Number 4 - Fav quarterback + age of pet + lucky number
                int magicNumber4 = question5 + question3 + question4;

                // Magic Number 5 - Third letter of favorite pet's name
                int magicNumber5 = question2.charAt(2);

                // Using inRange() method to keep numbers below max range limit
                magicBall = inRange(magicBall, 1, 75);
                magicNumber1 = inRange(magicNumber1, 1, 65);
                magicNumber2 = inRange(magicNumber2, 1, 65);
                magicNumber3 = inRange(magicNumber3, 1, 65);
                magicNumber4 = inRange(magicNumber4, 1, 65);
                magicNumber5 = inRange(magicNumber5, 1, 65);

                // Prints out lottery numbers with magic ball
                System.out.println("Lottery Numbers: " + magicNumber1 + ", " + magicNumber2 + ", " + magicNumber3 + ", " + magicNumber4 + ", " + magicNumber5 + ". Magic ball: " + magicBall);

            }

            // If user does not want to continue with the interactive portion
            else
            {
                System.out.println("Please come back later to complete the survey...");
            }

            // End of do-while loop; If user wants to play again, the loop will begin again
            System.out.println("Do you want to play again? Please enter 'Yes' or 'No'");
        } while(input.next().toLowerCase().equals("yes"));

        // End main curly bracket
    }

    // End public class Input curly bracket
}
