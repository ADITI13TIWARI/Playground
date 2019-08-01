#include<stdio.h>
#include<math.h>
int main()
{
  int num,i,j,c=0,z;
  scanf("%d",&num);
  for(i=num;i!=0;i/=10)
  {
  c++;
  }
  
 // printf("%d",c);
  z=pow(10,c-2);
   i=num/z;
   j=i%10;
  printf("%d",j);

  return 0;
}