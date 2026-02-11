#include<stdio.h>
#include<stdlib.h>

struct Array
{
    int *A;
    int size;
    int l;
};

void Display(struct Array arr)
{
    int i;
    for(i=0;i<arr.l;i++)
    {
        printf("%d ",arr.A[i]);
    }
}
int main()
{
    struct Array arr;
    int n,i;
    printf("\nenter size of elements\n");
    scanf("%d",&arr.size);
    arr.A=(int *)malloc(arr.size*sizeof(int));
    arr.l=0;
    printf("\nenter number of numbers\n");
    scanf("%d",&n);
    printf("\nenter elements\n");
    for(i=0;i<n;i++)
        scanf("%d",&arr.A[i]);
    arr.l=n;
    Display(arr);
    return 0;
}
