#include<stdio.h>
double horner(int x,int n)
{
    double s=1;
    for(;n>0;n--)
    {
        s=1+x*s/n;    
    }
    return s;
}
double e(int x,int n)
{
    static double s;
    if(n==0)
    {
        return s;
    }
    else
    {
        s=1+x*s/n;
        return e(x,n-1);
    }
}
int main()
{
    double r=horner(1,10);
    double a=e(2,10);
    printf("%lf\n",r);
    printf("%lf",a);
    return 0;
}