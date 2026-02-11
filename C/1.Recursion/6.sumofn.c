#include <stdio.h>
int sum(int n)
{
    if(n==0)
    return 0;
    else 
    return (sum(n-1)+n);
}
int Isum(int n)
{
    int s=0,i;
    for(i=1;i<=n;i++)
    {
       s=s+i; 
    }
    return s;
}
int main()
{
    int s=sum(5);
    int I=Isum(5);
    printf("%d\n",s);
    printf("%d",I);
    return 0;
}