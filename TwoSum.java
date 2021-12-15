/* 
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 

Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
*/


import java.util.Scanner;

public class TwoSum {

    public int[] twoSum(int[] numbers, int target) {

        for(int i = 0; i<numbers.length;i++){
            for(int j = 1;j<numbers.length;j++){
                if(numbers[i] + numbers[j]==target){
                    System.out.println(i +" " + j);
                    break;
                }
            }
        }
        return numbers;
    }
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the Array :");
        int length = scan.nextInt();
        int [] numbers = new int[length];
        System.out.println("nums = ");
        for(int i = 0; i<length; i++){
            numbers[i] = scan.nextInt();
        }

        System.out.println("target = ");
        int target = scan.nextInt();

        var obj = new TwoSum();
        obj.twoSum(numbers,target);
    }
}