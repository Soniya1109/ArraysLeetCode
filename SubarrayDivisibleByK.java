public class SubarrayDivisibleByK {
    static int Longestsubarray(int arr[],int N,int k)
    {
        int max1 = 0;
        for(int i=0;i<N;i++)
        {
            int sum1 = 0;
            for(int j=0;j<N;j++)
            {
                sum1 += arr[j];
                if(sum1%k == 0)
                max1 = Math.max(max1,j-i+1);
            }
        }
        return max1;
    }
    public static void main(String args[])
    {
        int a[] = {1,2,3,4,5};
        System.out.println(Longestsubarray(a, 2, 3));
    }
}
