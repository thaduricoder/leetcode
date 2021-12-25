/*

*/

import java.util.Scanner;

public class NumOfSegmentsInAWord {

    public int segment(String s){
        int count = 0;

        for(int i = 0; i<s.length();i++){

            if(s.charAt(i)!=' ' && (i==0 || s.charAt(i-1)==' ')){
                count++;
            }

        }

        return count;
    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        NumOfSegmentsInAWord obj = new NumOfSegmentsInAWord();

        int count = obj.segment(s);
        System.out.println(count);
    }
}
