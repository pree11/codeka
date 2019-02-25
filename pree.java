public class Alphabet
{

    public static void main(String[] args)
    {
    char c = '*';

        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'w'))
            System.out.println(c + " is an alphabet.");
        else
            System.out.println(c + " is not an alphabet.");
    }
}
