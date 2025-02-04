#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

int MatrixChainOrder(int p[],int n)
{
    int m[n][n];
    for(int i=1;i<=n;i++)
        m[i][i]=0;
    for(int l=2;l<=n;l++)
    {
        for(int i=1;i<=((n-l)+1);i++)
        {
            int j=((i+l)-1);
            m[i][j]=INT_MAX;
            for(int k=i;k<=j-1;k++)
            {
                int q=m[i][k] + m[k+1][j] + p[i-1]*p[k]*p[j];
                if( q<m[i][j])
                    m[i][j]=q;
            }
        }
    }
    return m[1][n-1];
}

void main()
{
    int arr[]={10,20,30,40,30};
    int size=sizeof(arr)/sizeof(arr[1]);
    int m=MatrixChainOrder(arr,size);
    printf("minimum no. of multiplications is : %d",m);
}
