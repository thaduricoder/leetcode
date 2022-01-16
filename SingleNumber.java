import java.util.*;
class Main
{
  static int toFindSingle (int arr[], int arr_size)
  {
    int res = arr[0];
    for (int i = 1; i < arr_size; i++)
        res = res ^ arr[i];

      return res;
  }
  public static void main (String[]args)
  {
    Scanner s=new Scanner(System.in);
	System.out.println("Enter size of an array :");
	int n=s.nextInt();
	int a[]=new int[n];
	System.out.println("Enter array elements: ");
	for(int i=0;i<n;i++) {
		  a[i]=s.nextInt();
	}
    System.out.println (toFindSingle (a, n));
  }
}
