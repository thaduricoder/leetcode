import java.util.*;
class PlusOne {
public static void main(String ar[]) {
	Scanner s=new Scanner(System.in);
    int i,n;
    n=s.nextInt();
    int arr[]=new int[50];
    for(i=0;i<n;i++) {
        arr[i]=s.nextInt();
    }
    if(arr[n-1]<9) {
        arr[n-1]=arr[n-1]+1;
        for(i=0;i<n;i++)
        System.out.println(arr[i]);
    }
    else {
        n=n+1;
        arr[n-1]=0;
        arr[n-2]=1;
        for(i=0;i<n;i++)
        System.out.println(arr[i]);
    }
}
}
