import java.util.*;
public class selectionsort {

    public static int selection(int arr[],int n)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int min= i;
            for(int j=i+1;i<arr.length;i++)
            {
                if(arr[min]>arr[j])
                {
                    min=j;
                }
            }
            int temp= arr[i];
            arr[i]= arr[min];
            arr[min]=temp;
        }return new int[]arr;
        
        
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        int re= selection( arr,n);
        System.out.println(re);
        
        


    }
}
