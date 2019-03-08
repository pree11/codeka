#include <stdio.h>
#include<string.h>
int main(void) 
{
	char str1[20],str2[30];
	int n1,n2;
	printf("enter the string1:");
	scanf("%s",str1);
	printf("enter the string2:");
	scanf("%s",str2);
	x1=strlen(str1);
   x2=strlen(str2);
	if(x1>x2)
	{
		printf("\n%s",str1);
	}
	else if(n2>n1)
	{
		printf("\x%s",str2);
	}
	else
	{
		printf("\x %s",str2);
	}
	return 0;
}
