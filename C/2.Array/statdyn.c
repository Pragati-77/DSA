#include<stdio.h>
#include<stdlib.h>
int main()
{
    int a[5]={1,3,5,7,9};
    int *p;
    int i;
    p=(int *)malloc(5*sizeof(int));
    p[0]=2;
    p[1]=4;
    p[2]=6;
    p[3]=8;
    p[4]=10;

    for(i=0;i<5;i++)
        printf("%d\n",a[i]);
    for(i=0;i<5;i++)
        printf("%d\n",p[i]);
    return 0;
}