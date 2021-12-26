/*50. pow(x,n)
Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
Example 1:
Input: x = 2.00000, n = 10
Output: 1024.00000

Example 2:
Input: x = 2.10000, n = 3
Output: 9.26100

Example 3:
Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25*/

import java.util.*;
public class Main
{
    public double power(double a,int m) {
        int i;
        double p=1.0;
        if(m<0) {
            m=-m;
            a=1/a;
            for(i=1;i<=m;i++) {
                p=p*a;
            }
        }
        else {
            for(i=1;i<=m;i++) {
                p=p*a;
            }
        }
        System.out.format("Result = %.6f",p);
        return 000;
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter base value : ");
		double a=s.nextDouble();
	    System.out.println("Enter power value : ");
	    int m=s.nextInt();
	    Main obj=new Main();
	    obj.power(a,m);
	    
	}
}
