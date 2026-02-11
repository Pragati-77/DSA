#include<stdio.h>
#include<stdlib.h>

struct Array
{
    int A[10];
    int size;
    int length;
};

void display(struct Array arr)
{
    int i;
    for(i=0;i<arr.length;i++)
    {
        printf("%d ",arr.A[i]);
    }
}

void append(struct Array *a,int x)
{
    if(a->length<a->size)
        a->A[a->length]=x;
        a->length++;

}

void insert(struct Array *a,int index,int x)
{
    int i;
    if(index>=0 && index<=a->length)
    {
        for(i=a->length;i>=index;i--)
        {
            a->A[i]=a->A[i-1];
        }
            a->A[index]=x;
            a->length++;
    }
}

int main()
{
    struct Array arr={{2,3,4,5,6},10,5};
    insert(&arr,3,10);
    // append(&arr,7);
    display(arr);
    return 0;
}