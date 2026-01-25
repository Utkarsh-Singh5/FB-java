public class arr {
    public static void main(String args[])
    {
        int nums[]={0,1,0,3,12};
        int arr[]= new int[nums.length];
       int c=0;
       //int w=0;
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]!=0)
        {
            arr[c++]=nums[i];
        }
        else
        {
            
            arr[arr.length-1]=arr[i];
        }
       }
       for(int i:arr)
       {
        System.out.print(i+" ");
       }
    }
    
}
