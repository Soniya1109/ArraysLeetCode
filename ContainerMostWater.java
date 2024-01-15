public class ContainerMostWater {
    public static int maxArea(int a[])
    {
        int left = 0;
        int right = a.length -1;
        int maxArea = 0;

        while(left<right)
        {
            int area = Math.min(a[left],a[right]) *(right - left);
            maxArea = Math.max(area,maxArea);
            if(a[left]<a[right])
            left++;
            else
            right--; 
        }
        return maxArea;
    }
    public static void main(String args[])
    {
        int a[] = {1,2,3,4};
        System.out.println(maxArea(a));
    }
}
