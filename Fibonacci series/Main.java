#include<stdio.h>
int main()
{
  int a=0,b=1,c=0,i,n;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
   printf("%d ",a);
    c=a+b;
    a=b;
    b=c;
    
  }
  //Type your code here
  return 0;
}