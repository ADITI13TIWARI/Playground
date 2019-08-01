#include<stdio.h>
int main()
{
  int n,ar[100],i,j;
  scanf("%d",&n);
  for(i=0;i<n;i++)
    scanf("%d",&ar[i]);
  for(i=0;i<n;i++)
  {
    for (j=i+1;j<n;j++)
    {
      if(ar[i]<ar[j])
      {
        int t=ar[i];
        ar[i]=ar[j];
        ar[j]=t;
      }
    }
  }

    printf("%d",ar[0]);
  	//type your code here
}