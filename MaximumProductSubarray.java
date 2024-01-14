public class MaximumProductSubarray {
    static int maxproduct(int a[])
    {
        int n = a.length;
        int leftproduct = 1;
        int rightproduct = 1;
        int ans = a[0];

        for(int i=0;i<n;i++)
        {
            leftproduct = leftproduct == 0 ? 1 : leftproduct;
            rightproduct = rightproduct == 0 ? 1 : rightproduct;

            leftproduct *= a[i];
            rightproduct *= a[n-1-i];

            ans = Math.max(ans, Math.max(leftproduct,rightproduct));
        }
        return ans;
    }
    public static void main(String args[])
    {
        int a[] = {1,4,-3,2};
        System.out.println(maxproduct(a));
    }
}
