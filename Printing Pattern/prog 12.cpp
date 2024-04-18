// By APURVA KUMAR at 11/06/2022 time 12 AM onward!!
#include<stdio.h>
int main()
{
	int n,i,j, space;
	printf("Enter the Rows:");
	scanf("%d", &n);
	
	for(i=n; i>=1; i--)
	{
		for(space=1; space<=n-i; space++)
		{
			printf(" ");
		}
		for(j=1; j<=2*i-1; j++)
		{
			printf("*");
		}
		printf("\n");
	}
	return 0;
}