import java.util.*;
public class ChocolateDistribution {
    static int chocolate(int arr[],int n,int m)
    {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i=0;i+m-1<n;i++)
        {
            int diff = arr[i+m-1]-arr[i];
            if(diff<min)
            min = diff;

        }
        return min;

    }
    public static void main(String args[])
    {
         int arr[] = {1,5,4,3,2,6};
         int n = arr.length;
         int m = 5;
         System.out.println(chocolate(arr,n,m));
    }
}
