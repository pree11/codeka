import java.util.Scanner;

public class CheckDigits {

	public static void main(String[] args)
  {
		Scanner Kb=new Scanner(System.in);
		System.out.println("How man strings u want to check?");
	
		int t=Kb.nextInt();
	
		while(t-->0)
{
System.out.println("Enter the string!");
			String s=Kb.next();
			
			int digits=0;
			
			for(int i=0;i<s.length();i++)
      {
				
				if(Character.isDigit(s.charAt(i)))
        {
					
					digits++;
				}
			}
				System.out.println(digits);
		}
		System.out.println();
	}

}

 

TOP Interview Codin
