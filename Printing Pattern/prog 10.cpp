// By APURVA KUMAR at 11/06/2022 time 12 AM onward!!
#include<stdio.h>
int main()
{
	int n,i,j;
	printf("Enter the rows:");
	scanf("%d",&n);
	
	for(i=1; i<=n; i++)
	{
		for(j=1; j<=i; j++)
		{
			printf("%c ",64+j);
		}
		printf("\n");
	}
	return 0;
}
