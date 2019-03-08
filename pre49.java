 import java.util.*;
     
    class main 
    {
    	static Scanner in = new Scanner(System.in);
    	public static void main(String[] args) 
    	{
    		int firstNumber, secondNumber, total = 0;
    		firstNumber = in.nextInt();
    		secondNumber = in.nextInt();
    		for(int i=firstNumber; i<=secondNumber; i++) 
    		{
    			total += i;
    		}
    		System.out.println("Sum : "+total);
    	}
    }
