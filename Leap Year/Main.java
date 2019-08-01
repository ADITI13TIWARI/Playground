#include<stdio.h>
int main()
{
  int yr;
  scanf("%d",&yr);
  if(yr%4==0)
  {
    if(yr%100==0 && yr%400==0)
    printf("LEAP YEAR");
    else 
      printf("NOT LEAP YEAR");
  }
  else
    printf("NOT LEAP YEAR");
  
  
  //Type your code here
  return 0;
}