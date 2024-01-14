public class Productofallexceptself {
    public static int[] product(int a[])
    {
        int[] left = new int[a.length];
        int[] right = new int[a.length];

        left[0] = 1;
        for(int i=1;i<a.length;i++)
        {
            left[i] = left[i-1]*a[i-1];
        }
        right[a.length-1] = 1;
        for(int i=a.length-2;i>-1;i--)
        {
            right[i] = right[i+1]*a[i+1];
        }

        int[] ans = new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            ans[i] = left[i]*right[i];
        }
        return ans;
    }
    public static void main(String args[])
    {
        //int a[] = {1,2,3,4};
        //int arr[] = product(a);
        //System.out.println(arr);
    }
}
