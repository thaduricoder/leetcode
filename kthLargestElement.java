import java.util.*;

class Main {
	public static int kthLargest(int[] arr,
								int k)
	{
		for(int i=0;i<arr.length;i++) {
		    for(int j=i+1;j<arr.length;j++) {
		        if(arr[j]>arr[i]) {
		            int temp=arr[i];
		            arr[i]=arr[j];
		            arr[j]=temp;
		        }
		    }
		}
		return arr[k - 1];
	}
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter size of an array : ");
	    int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter an array elements : ");
		for(int i=0;i<arr.length;i++)
		    arr[i]=sc.nextInt();
		System.out.println("Enter k value : ");
		int k=sc.nextInt();
		System.out.print("K'th largest element is " + kthLargest(arr, k));
	}
}
