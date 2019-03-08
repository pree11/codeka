import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class PassTest 
{
    public static String password = "";
    public static int upperCase = 0;
    public static int lowerCase = 0;
    public static int numberCount = 0;
    public static final String FINAL_CHAR_REGEX = "[!@#$%^&*()[\\\\]|;',./{}\\\\\\\\:\\\"<>?]";

public static void main(String[] args) throws IOException {
    BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your password: ");
             password = dataIn.readLine();
            for ( int i = 0; i < password.length() ; i++ ) 
            {
                if (Character.isUpperCase(password.charAt(i))){ upperCase++; }
                if (Character.isLowerCase(password.charAt(i))){ lowerCase++; }
                if (Character.isDigit(password.charAt(i)))    { numberCount++;}
            }
        int specialCharCount = password.split(FINAL_CHAR_REGEX, -1).length - 1;
            System.out.printf("Your password contains %d uppercases, %d lowercases, %d digits and %d special characters.\n\n", upperCase, lowerCase, numberCount, specialCharCount);
        ;
       }
}
