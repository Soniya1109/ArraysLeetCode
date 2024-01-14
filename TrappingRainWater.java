public class TrappingRainWater {
    static int trap(int a[])
    {
        int res = 0;
        int lhb = a[0];
        int rhb = a[a.length-1];
        int l = 0;
        int r = a.length-1;
        while(l<=r)
        {
            if(lhb <= rhb)
            {
                if(a[l] >= lhb)
                 lhb = a[l];
                else
                 res = res + lhb - a[l];
                l++;
            }
            else{
                if(a[r] >= rhb)
                 rhb = a[r];
                else
                 res = res + rhb - a[r];
                r--;
            }
        }
        return res;
    }
    public static void main(String args[])
    {
        int a[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(a));
    }
}
