// C Find the sum of all non-repeated
// elements in an array
#include<stdio.h>
int findSum(int arr[], int n)
{
    // sort all elements of array
    int i,j,temp;
    for(i=0;i<n;i++) {
    	for(j=i+1;j<n;j++) {
    		if(arr[i]>arr[j]) {
    			temp=arr[i];
    			arr[i]=arr[j];
    			arr[j]=temp;
			}
		}
		//printf("%d",arr[i]);
	}
    printf("\n");
    int sum = 0;
    for(i=0; i<n; i++)
    {
        if (arr[i] != arr[i+1])
            sum = sum + arr[i];
    }
 
    return sum;
}
 
// Driver code
int main()
{
    int arr[20];
    int n,i;
    scanf("%d",&n);
    for(i=0;i<n;i++) {
    	scanf("%d",&arr[i]);
	}
    printf("%d",findSum(arr, n));
    return 0;
}
