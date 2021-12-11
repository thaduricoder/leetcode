import java.util.Scanner;
import  java.lang.String;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String word = scan.next();

        int length = word.length();
         for(int i = length-1;i>=length-2;i--){
             System.out.print(word.charAt(i)+" ");
         }
    }
}
