/*
The power of the string is the maximum length of a non-empty substring that contains only one unique character.

Given a string s, return the power of s.

 

Example 1:

Input: s = "leetcode"
Output: 2
Explanation: The substring "ee" is of length 2 with the character 'e' only.
Example 2:

Input: s = "abbcccddddeeeeedcba"
Output: 5
Explanation: The substring "eeeee" is of length 5 with the character 'e' only.
Example 3:

Input: s = "triplepillooooow"
Output: 5
Example 4:

Input: s = "hooraaaaaaaaaaay"
Output: 11
Example 5:

Input: s = "tourist"
Output: 1
 

Constraints:

1 <= s.length <= 500
s consists of only lowercase English letters.
*/

import java.util.Scanner;
import java.lang.String;

public class ConsecutiveCharacters {

    public int maxCount(String s){

        int count = 1;
        int ans =1;

        for(int i = 0;i<s.length()-1;i++){
            if(s.charAt(i)!=s.charAt(i+1)) {
               ans = Math.max(ans,count);
                count = 1;
            }
            else {
                count++;
            }
        }

        return ans;
    }
    public static void main(String[] ars){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = scan.next();

        ConsecutiveCharacters obj = new ConsecutiveCharacters();

        int count = obj.maxCount(s);
        System.out.println(count);
    }
}
