import java.util.*;
public class Main
{
    public int[] threeSum(int[] arr,int target) {
        int i,j,k;
        for(i=0;i<arr.length;i++) {
            for(j=i+1;j<arr.length;j++) {
                for(k=i+2;k<arr.length;k++) {
                    if(arr[i]+arr[j]+arr[k]==target) {
                        System.out.printf("[%d,%d,%d]",arr[i],arr[j],arr[k]);
                    }
                }
            }
        }
        return arr;
    }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

        System.out.print("Enter the size of the Array :");
        int n = s.nextInt();
        int [] arr = new int[n];
        System.out.println("Elements of an array : ");
        for(int i = 0; i<n; i++){
            arr[i] = s.nextInt();
        }

        System.out.println("target = ");
        int target = s.nextInt();

        var obj = new Main();
        obj.threeSum(arr,target);
	}
}
