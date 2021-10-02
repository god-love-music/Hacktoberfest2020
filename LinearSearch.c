#include<stdio.h>
int LinearSearch(int A[],int target,int n)
{
    for(int i=0;i<n;i++)
    {
        if(A[i]==target)
        {
            printf("Element is found %d ",i);
            exit(0);
        }
    }
    printf("Element is not found it");
}