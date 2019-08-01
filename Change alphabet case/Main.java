#include <stdio.h>
#include<ctype.h>
int main() {
  char s;
  scanf("%c",&s);
  if(isupper(s))
  {  s=32+s;
    printf("%c",s);
  }
  else 
  {
    s=s-32;
    printf("%c",s);
  }// Type your code here
	return 0;
}