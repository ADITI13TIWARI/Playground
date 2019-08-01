#include<stdio.h>
int main()
{
  //Type your code here
  int n,a,b,add;
  scanf("%d",&n);
  a=n/100;
  b=n%10;
  add=a+b;
  printf("%d",add);
  return 0;
}