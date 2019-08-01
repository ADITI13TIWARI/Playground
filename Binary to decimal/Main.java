#include<stdio.h>
int main()
{
  int n,ar[100],i,r,k=0,sum=0;
 scanf("%d",&n);
  for(i=n;i!=0;i/=10)
  {
    r=i%10;
    ar[k++]=r;
  }
  for(i=0;i<k;i++)
  {
    sum=sum+(ar[i]*pow(2,i));
  }
  printf("%d",sum);
    
  //Type your code here
  return 0;
}