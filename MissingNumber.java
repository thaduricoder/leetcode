/*Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
Example 1:
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

Example 2:
Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.

Example 3:
Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.*/



import java.util.*;
import java.util.Arrays;
class Main {
    public static int missingNumber(int[] arr) {
        int n=arr.length;
        int i,j,c=0;
        for(i=0;i<n;i++) {
            for(j=i+1;j<n;j++) {
                if(arr[j]<arr[i]) {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        if(arr[n-1]!=n)
        return n;
        if(arr[0]!=0)
        return 0;
        for(i=1;i<n;i++) {
            if(arr[i]!=arr[i-1]+1) {
                return arr[i-1]+1;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
	    System.out.println("Enter size of an array : ");
	    int n=sc.nextInt();
		  int[] numbers=new int[n];
		  System.out.println("Enter an array elements : ");
		  for(int i=0;i<numbers.length;i++) {
		    numbers[i]=sc.nextInt();
      }
        System.out.println(missingNumber(numbers));
    }
}
