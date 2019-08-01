#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  if(n%2!=0)
    n=n-1;
  else 
    n=(n-1)/2;
  printf("%d",n);
	//type your code here
	
}