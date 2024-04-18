// By NAYAN KUMAR PRAMANIK at 11/06/2022 time 12 AM onward!!
#include<stdio.h>
int main()
{
 int i,j,n;
 printf("Enter the data to be print:");
 scanf("%d",&n);
 
 for(i=1;i<=n;i++)
 {
 	for(j=1;j<=i;j++)
 	{
 		printf("%d ",j);
	 }
	 printf("\n");
 }	
 return 0;
}