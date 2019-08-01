#include<stdio.h>
int main()
{
  int i,n,r,ar[10],k=0;
  scanf("%d",&n);
  for(i=n;i!=0;i/=2)
  {
    r=i%2;
   ar[k]=r;
    k++;
  }
  for(i=k-1;i>=0;i--)
     printf("%d",ar[i]);
  //Type your code here
  return 0;
}