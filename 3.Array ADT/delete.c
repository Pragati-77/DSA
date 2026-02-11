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
int delete(struct Array *a,int index)
{
    int i;
    int x=0;
    if(index>=0 && index<a->length)
    {

        x=a->A[index];
        for(i=index;i<a->length-1;i++)
        {
            a->A[i]=a->A[i+1];
        }
        a->length--;
        return x;
    }
    return 0;
}
int main()
{
    struct Array arr={{2,3,4,5,6},10,5};
    delete(&arr,1);
    display(arr);
    return 0;
}
