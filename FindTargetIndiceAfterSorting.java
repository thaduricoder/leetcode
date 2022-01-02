import java.util.*;
public class Main
{
    public int sort(int[] arr,int target) {
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[j]<arr[i]) {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==target)
            System.out.println(i);
            }
            return 0;
        
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter size of an array : ");
	    int n=sc.nextInt();
		  int[] numbers=new int[n];
		  int target;
		  System.out.println("Enter an array elements : ");
		  for(int i=0;i<numbers.length;i++) {
		    numbers[i]=sc.nextInt();
      }
		  System.out.println("Target : ");
		  target=sc.nextInt();
		  var obj=new Main();
		  obj.sort(numbers,target);
	}
}
