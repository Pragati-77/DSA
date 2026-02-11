#include <stdio.h>
int fact(int n)
{
    if (n==0)
    return 1;
    else 
    return (fact(n-1)*n);
}
int ncr(int n,int r)
{
    if(r==0||n==r)
    return 1;
    else
    return(ncr(n-1,r-1)+ncr(n-1,r));
}
int sumncr(int n,int r)
{
    int num,den;
    num=fact(n);
    den=fact(r)*fact(n-r);
    return num/den;
}
int main()
{
    printf("%d ",ncr(4,2));
    printf("%d ",sumncr(4,2));
    return 0;
}