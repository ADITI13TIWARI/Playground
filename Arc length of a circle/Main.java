#include<stdio.h>
int main()
{
	float r,ang,arc,pi=3.14;
    scanf("%f%f",&r,&ang);
    arc=(ang/360)*2*pi*r;
    printf("%.2f",arc);
   return 0;
  }