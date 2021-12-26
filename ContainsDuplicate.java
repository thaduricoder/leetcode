/*
217. Contains Duplicate

Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

Example 1:

Input: nums = [1,2,3,1]
Output: true

Example 2:

Input: nums = [1,2,3,4]
Output: false

Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 

Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109
*/
import java.util.Arrays;
import java.util.Scanner;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);
        for(int i = 1;i<nums.length;i++){
            if(nums[i]==nums[i-1])
                return true;
        }

        return false;

    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        ContainsDuplicate obj = new ContainsDuplicate();

        System.out.print("Enter the size of the Array :");
        int size = scan.nextInt();

        int[] nums = new int[size];
        System.out.println("Enter the Array elements : ");
        for(int i =0;i<size;i++){
            nums[i] = scan.nextInt();
        }

        boolean result = obj.containsDuplicate(nums);
        System.out.println(result);
    }
}
