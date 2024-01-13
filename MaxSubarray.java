public class MaxSubarray {
    static int Kadanealgorithm(int arr[])
    {
        int maxsum = arr[0];
        int sum = arr[0];
        for(int i =0;i<arr.length;i++)
        {
            if(sum>=0)
            {
                sum+=arr[i];
            }
            else
            {
                sum = arr[i];
            }
            if(sum>maxsum)
            {
                maxsum = sum;
            }

        }
        return maxsum;
    }
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int s = Kadanealgorithm(arr);
        System.out.println(s);
    }
}
