#include<stdio.h>
int main()
{
  int n,i,r,k=0,ar[100];
  scanf("%d",&n);
  if(n<10)
    printf("%d",n);
  else
  {
  for(i=n;i!=0;i/=8)
  {
    r=i%8;
    ar[k]=r;
    k++;
  }
  for(i=k-1;i>=0;i--)
  {
    printf("%d",ar[i]);
  }
  }
  //type your code here
  return 0;
}