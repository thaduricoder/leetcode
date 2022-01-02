import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] ars){

        Scanner s = new Scanner(System.in);
        System.out.print("Enter length of arr1 : ");
        int m = s.nextInt();
        int [] arr1 = new int[m];
        int temp,r,i,j;
        int [] merge = new int[50];
	    float median;
        System.out.println("Elements of arr1 : ");
        for(i = 0; i<m; i++){
            arr1[i] = s.nextInt();
            merge[i]=arr1[i];
        }
        System.out.print("Enter length of arr2 : ");
        int n = s.nextInt();
        int [] arr2 = new int[n];
        System.out.println("Elements of arr2 : ");
        int k;
	    k=i;
        for(i = 0; i<n; i++){
            arr2[i] = s.nextInt();
            merge[k]=arr2[i];
	    	k++;
        }
        r=m+n;
	    //Sorting the merged array
	    System.out.println("After sorting \n");
	for(i=0;i<r;i++) {
		for(j=i+1;j<r;j++) {
			if(merge[i]>merge[j]) {
			temp=merge[i];
			merge[i]=merge[j];
			merge[j]=temp;
		}
		}
		System.out.println(merge[i]);
	}
    }
}
