public class MinimumRotatedArray {
        public static int findMin(int[] a) {
            int low = 0 ,high = a.length-1, ans = Integer.MAX_VALUE;
            while(low<=high)
            {
                int mid = (low+high)/2;
                if(a[low]<=a[mid])
                {
                    ans = Math.min(ans,a[low]);
                    low = mid+1;
                }
                else
                {
                    ans = Math.min(ans,a[mid]);
                    high = mid-1;
                }
            } 
            return ans;
        }
        public static void main(String args[])
        {
            int a[] = {3,4,5,1,2};
            System.out.println(findMin(a));
        }
    }

