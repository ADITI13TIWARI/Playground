#include <stdio.h>
#include<math.h>
int main() {
  int num,a,b,x,sum=0,i,c=0;
  scanf("%d",&num);
  for(i=num;i!=0;i/=10)
    c++;
   // printf("%d",c);
  x=pow(10,c-1);
  a=num/x;
  b=num%10;
  sum=a+b;
  printf("%d",sum);
	//Type your code
	return 0;
}