/*Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
The overall run time complexity should be O(log (m+n)).
Example 1:
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

Example 2:
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.*/

import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] ars){

        Scanner s = new Scanner(System.in);
        System.out.print("Enter length of arr1 : ");
        int m = s.nextInt();
        int [] arr1 = new int[m];
        int temp,r,i,j;
        int [] merge = new int[50];
	    float median;
        System.out.println("Elements of arr1 : ");
        for(i = 0; i<m; i++){
            arr1[i] = s.nextInt();
            merge[i]=arr1[i];
        }
        System.out.print("Enter length of arr2 : ");
        int n = s.nextInt();
        int [] arr2 = new int[n];
        System.out.println("Elements of arr2 : ");
        int k;
	    k=i;
        for(i = 0; i<n; i++){
            arr2[i] = s.nextInt();
            merge[k]=arr2[i];
	    	k++;
        }
        r=m+n;
	    //Sorting the merged array
	    System.out.println("After sorting \n");
	for(i=0;i<r;i++) {
		for(j=i+1;j<r;j++) {
			if(merge[i]>merge[j]) {
			temp=merge[i];
			merge[i]=merge[j];
			merge[j]=temp;
		}
		}
		System.out.println(merge[i]);
	}
	//Finding the median of the sorted array
	if(r%2==0) {
		 median=(merge[(r-2)/2]+merge[r/2])/(float)2.0;
	     System.out.println("median is : " + median);
	}
	else {
		median=merge[r/2];
		System.out.println("Median is " + median);
   }  
    }
} 
