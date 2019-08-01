#include<stdio.h>
int main()
{
  int n,i,r,sum=0;
  scanf("%d",&n);
  for(i=n;i!=0;i/=10)
  {
    r=i%10;
    sum=sum+r;
  }
  printf("%d",sum);
  //Type your code here
  return 0;
}