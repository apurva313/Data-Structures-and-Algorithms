// By APURVA KUMAR at 11/06/2022 time 12 AM onward!!
#include<stdio.h>
int main()
{
	int n, i, j;
	printf("Enter the Rows:");
	scanf("%d",&n);
	
	for(i=1; i<=n; i++)
	{
		for(j=0; j<=n; j++)
		{
			if((i+j)<=n)
			{
				printf(" ");
			}
			else
			{
				printf("*");
			}
		}
		printf("\n");
	}
	return 0;
	
}