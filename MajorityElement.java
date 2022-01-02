import java.util.*;
class Main {
    public static int mostFrequent(int arr[], int n)
    {
        Arrays.sort(arr);
        int max_count = 1, res = arr[0];
        int curr_count = 1;
         
        for (int i = 1; i < n; i++)
        {
            if (arr[i] == arr[i - 1])
                curr_count++;
            else
            {
                if (curr_count > max_count)
                {
                    max_count = curr_count;
                    res = arr[i - 1];
                }
                curr_count = 1;
            }
        }
        if (curr_count > max_count)
        {
            max_count = curr_count;
            res = arr[n - 1];
        }
     
        return res;
    }
    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n=s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements : ");
        for(int i=0;i<arr.length;i++) 
        arr[i]=s.nextInt();
        System.out.println(mostFrequent(arr,n));
         
    }
} 
