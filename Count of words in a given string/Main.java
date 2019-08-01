#include<stdio.h>

int main()
{
  int i,c=0;
  char s[100];
  scanf("%[^\n]s",s);
  for(i=0;s[i]!='\0';i++)
  {
    if(s[i]==' ')
      c++;
  }
 // c++;
  printf("%d",c+1);
  //Type your code here
  
}