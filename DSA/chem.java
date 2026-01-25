import java.util.*;
public class chem {
    public static void help_classmate(int arr[], int n) {
    int newarr[]= new int[arr.length];
         for(int i=0;i<arr.length;i++)
         {
             int c=0;
             for(int j=i;j<arr.length;j++)
             {
                 if(arr[i]>arr[j])
                 {
                     c++;
                     if(c==1)
                     {
                         newarr[i]=arr[j];
                         break;
                         
                     }


                     
                 }
             }if(c==0)
             {
                 newarr[i]=-1;
                 
             }
         } 
         for(int i=0;i<arr.length;i++)
         {
            System.out.print(newarr[i]+" ");
         }
    
}
  public static void main(String args[])
  {

    Scanner s= new Scanner(System.in);
    int n= s.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=s.nextInt();
        
    }
    help_classmate( arr,n);

  }
}
