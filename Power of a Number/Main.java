#include <stdio.h>
int main()
{
  int a,b,c;
  scanf("%d%d",&a,&b);
  if(b>=0)
  {
  c=pow(a,b);
  
  printf("%d",c);
  }
  else
    printf("Wrong input");
  	//Your code here       
    return 0;
}