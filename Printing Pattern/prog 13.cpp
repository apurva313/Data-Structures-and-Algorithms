#include<stdio.h>
int main()
{
	int n,i,j,space;
	printf("Enter the rows:");
	scanf("%d",&n);
	
	for(i=1; i<=n; i++)
	{
		for(space=1; space<=n-i; space++)
		{
			printf(" ");
		}
		for(j=1; j<=i; j++)
		{
			printf("*");
		}
		printf("\n");
	}
	for(i=n; i>=1; i--)
	{
		for(space=1; space<=n-i; space++)
		{
			printf(" ");
		}
		for(j=1; j<=i; j++)
		{
			printf("*");
		}
		printf("\n");
	}
}