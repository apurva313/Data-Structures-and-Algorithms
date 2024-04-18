// By APURVA KUMAR at 11/06/2022 time 12 AM onward!!
#include<stdio.h>
int main()
{
	int n,i,j;
	int number=1;
	printf("Enter the rows:");
	scanf("%d", &n);
	
	for(i=1; i<=n; i++)
	{
		for(j=1; j<=i; j++)
		{
			printf("%d ", number);
			number++;
		}
		printf("\n");
	}
	return 0;
}