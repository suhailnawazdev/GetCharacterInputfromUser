import java.util.Scanner;

public class GetCharacterInputfromUser
{
    public static void main(String args[])
    {
        char ch;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter a Character : ");
        ch = scan.next().charAt(0);
		
        System.out.print("You entered " +ch);
    }
}