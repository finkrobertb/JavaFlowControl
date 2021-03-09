
public class AsciiChars
{

    public static void printNumbers()
    {
        for(char i = 48; i <= 57; i++)
        {
            System.out.println(i);
        }
    }

    public static void printLowerCase()
    {
        for(char i = 97; i <= 122; i++)
        {
            System.out.println(i);
        }
    }

    public static void printUpperCase()
    {
       for(char i = 65; i <= 90; i++) {
           System.out.println(i);
       }
    }

    public static void main(String[] args)
    {
        printNumbers();
        printLowerCase();
        printUpperCase();

    }
}
