/*34. Find First and Last Position of Element in Sorted Array

Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
Example 1:
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

Example 2:
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]


Example 3:
Input: nums = [], target = 0
Output: [-1,-1]*/

import java.util.*;
public class Main
{
    public int searchRange(int[] arr,int n,int target) {
        int i,c=0;
        Arrays.sort(arr);
        for(i=0;i<n;i++) {
            if(arr[i]==target)
            System.out.printf("%d ",i);
            else
            c++;
        }
        if(c==n)
        System.out.println("[-1,-1]");
        
        return 0;
    }
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n=s.nextInt();
		System.out.println("Enter array elements : ");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
		    arr[i]=s.nextInt();
		}
		System.out.println("Target : ");
		int target=s.nextInt();
		Main obj=new Main();
		obj.searchRange(arr,n,target);
	}
}
