#include <stdio.h>
int main() {
  int n,i,sum=0;
  scanf("%d",&n);
  for(i=n;i!=0;i/=10)
  
    sum=sum+i%10;
    printf("%d",sum);
	//Type your code
	return 0;
}