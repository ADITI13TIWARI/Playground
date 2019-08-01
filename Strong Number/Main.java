#include <stdio.h>
int main() {
  int n,j,i,fact,sum=0,r;
  scanf("%d",&n);
  for(i=n;i!=0;i/=10)
  {
    r=i%10;
    fact=1;
    for(j=1;j<=r;j++)
    {  fact=fact*j;
    }
    sum=sum+fact;
  }
  //printf("%d",sum);
  if(sum==n)
    printf("Yes");
  else
    printf("No");
    
	//Type your code
	return 0;
}