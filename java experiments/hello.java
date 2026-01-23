
public class hello{
    public static void main(String args[])
    {
        int target=2;
        int arr[]={1,2,3};
        int m=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
               
            for(int j=0;j<arr.length;j++)
            {int sa=0; 
                for(int k=i;k<=j;k++)
                {
                    sa+=arr[k];
                }
                if(sa>m)
                {
                    m=sa;
                }
                
            }System.out.println();
        }if(m==target)
        {
        System.out.println(m);
        }
    }
}
