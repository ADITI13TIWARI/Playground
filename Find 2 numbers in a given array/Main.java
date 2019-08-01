#include<stdio.h>
int main()
{
  int ar[100],a,b,n,i,c1=0,c2=0;
  scanf("%d",&n);
  for(i=0;i<n;i++)
    scanf("%d",&ar[i]);
  scanf("%d",&a);
  scanf("%d",&b);
  for(i=0;i<n;i++)
  {
    if(ar[i]==a)
    {printf("Element 1 index = %d\n",i);
    c1++;
     
    }
  }
      if(c1==0)
  printf("Element 1 index = -1\n");
    for(i=0;i<n;i++)
    {if(ar[i]==b)
      {printf("Element 2 index = %d\n",i);
    c2++;
  
    }
  }

   if(c2==0)
  printf("Element 2 index = -1");
  	//type your code here
}