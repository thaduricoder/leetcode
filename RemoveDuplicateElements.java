import java.util.*;
public class Main
{
    public int[] duplicateElements(int[] a,int n) {
    int i,j,temp;
    Arrays.sort(a);   
    System.out.println("After sorting the elements : ");
	//performing sorting operation
	for(i=0;i<n;i++) {
		System.out.println(a[i]);
	}
	//to remove the duplicate elements
	i=0;
	for(j=1;j<n;j++) {
		if(a[j]!=a[i]) {
			i++;
			a[i]=a[j];
		}
	}
    System.out.println("Length of the array after removing the duplicate elements is : "+(i+1));
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
