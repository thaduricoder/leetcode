import java.util.Arrays;
import java.util.*;
public class Main
{
    public int[] duplicateElements(int[] a,int n) {
        int[] b=new int[n];
        int sum=0,i;
        for(i=0;i<n;i++) {
            sum=sum+a[i];
            b[i]=sum;
        }
        System.out.println(Arrays.toString(b));
        return a;
    }     
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of an array :");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array elements: ");
		for(int i=0;i<n;i++) {
		    a[i]=s.nextInt();
		}
		Main obj=new Main();
		obj.duplicateElements(a,n);
	}
}
