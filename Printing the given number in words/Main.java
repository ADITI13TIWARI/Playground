#include<stdio.h>
int main()
{
  int num;
  scanf("%d",&num);
  switch(num)
  {
    case 1: printf("One");
      		break;
    case 3: printf("Three");
      		break;
    case 5:printf("Five");
      	break;
    default: printf("Invalid");
  }
  //Type your code here
  return 0;
}