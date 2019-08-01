#include <stdio.h>
int main() {
  int n,sum=0,r,i;
  scanf("%d",&n);
  for(i=n;i!=0;i/=10)
  {
    r=i%10;
    sum=sum+(r*r*r);
  }
  if(sum==n)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
	//Type your code
	return 0;
}