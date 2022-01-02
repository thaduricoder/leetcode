/*
912. Sort an Array
Given an array of integers nums, sort the array in ascending order.

 

Example 1:

Input: nums = [5,2,3,1]
Output: [1,2,3,5]
Example 2:

Input: nums = [5,1,1,2,0,0]
Output: [0,0,1,1,2,5]
 

Constraints:

1 <= nums.length <= 5 * 104
-5 * 104 <= nums[i] <= 5 * 104
*/

class Solution {
    public int[] sortArray(int[] nums) {
        
        if(nums.length<2)
            return nums ;
        
        int midIndex = nums.length/2;
        
        int[] left = new int[midIndex];
        for(int i = 0;i<midIndex;i++)
            left[i] = nums[i];
        
        int[] right = new int[nums.length - midIndex];
        for(int j = midIndex; j < nums.length; j++)
            right[j - midIndex] = nums[j];
        
        sortArray(left);
        sortArray(right);
        
        merge(left,right,nums);
         return nums;
    }
    public void merge(int[] left, int[] right, int[] result){
        int i = 0, j = 0, k = 0;
        while (i<left.length && j<right.length){
            if(left[i] <= right[j])
                result[k++]=left[i++];
            else
                result[k++] = right[j++];
        }
        while(i < left.length)
            result[k++] = left[i++];
        while(j < right.length)
            result[k++] = right[j++];
    }
}
