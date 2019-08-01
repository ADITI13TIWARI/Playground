#include<stdio.h>
int main()
{
  int l,c=1,i;
  char s[40];
  scanf("%s",s);
  l=strlen(s);
  if(l>20)
    printf("Invalid Input");
  else
  {
  for(i=0;i<l;i++)
  {
    if(s[i]==s[i+1])
      c++;
    else
    {
      printf("%c%d",s[i],c);
      c=1;
    }
  }
  }
	//type your code here
}