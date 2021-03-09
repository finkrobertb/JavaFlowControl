

public class Test
{

    public static void main(String[] args)
    {

        // Lotto Numbers
        int randomNumberMin = 1;
        int randomNumberMax = 65;
        int magicBallMin = 1;
        int magicBallMax = 75;

        double randomNumber1 = Math.floor(Math.random() * (randomNumberMax - randomNumberMin + 1) + randomNumberMin);
        double randomNumber2 = Math.floor(Math.random() * (randomNumberMax - randomNumberMin + 1) + randomNumberMin);
        double randomNumber3 = Math.floor(Math.random() * (randomNumberMax - randomNumberMin + 1) + randomNumberMin);    
        
        System.out.println(randomNumber1);  
        System.out.println(randomNumber2);
        System.out.println(randomNumber3);
    }
}
