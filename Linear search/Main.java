#include<stdio.h>
int main()
{
  int i,n,ar[100],x,c=0;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&ar[i]);
  }
  scanf("%d",&x);
  for(i=0;i<n;i++)
  {
    if(ar[i]==x)
    {printf("%d",i+1);
    c++;
    break;
    }
    //else
    //  printf("%d isn't present in the array.",x);
  }
  if(c==0)
      printf("%d isn't present in the array.",x);
      
  //Type your code here
  return 0;
}