import java.util.*;
class hello
{
	public static void main(String ar[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int sum=0;
		int  arr[]=new int[n];
		for(int i=1;i<n;i++)
		{
		arr[i]=in.nextInt();
		}
		for(int i=1;i<=k;i++)
		{
sum=sum+arr[i];
		}
System.out.println(sum);
		
	}
}
