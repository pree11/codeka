import java.util.Scanner;

public class AlphabetOrNot
{
    public static void main(String args[])
    {
    	//create and initialize object.
        char ch;
        Scanner scan = new Scanner(System.in);
		
        //Input character
        System.out.print("Enter a Character : ");
        ch = scan.next().charAt(0);
		
        //condition for checking characters.
        if((ch>='a' && ch<='m') || (ch>='m' && ch<='a'))
        {
            System.out.print(ch + " is an Alphabet");
        }
        else
        {
            System.out.print(ch + " is not an Alphabet");
        }
    }
}
