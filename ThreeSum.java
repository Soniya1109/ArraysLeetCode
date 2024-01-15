import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;
import java.util.ArrayList;
public class ThreeSum {
    List<List<Integer>> threesum(int a[])
    {
       if(a == null || a.length<3) return new ArrayList<>();
       Arrays.sort(a);
       Set<List<Integer>> result = new HashSet<>();
       for(int i =0;i<a.length-2;i++)
       {
        int left = i+1;
        int right = a.length-1;
        while(left<right)
        {
            int sum = a[i] + a[left] + a[right];
            if(sum == 0)
            {
                result.add(Arrays.asList(a[i],a[left],a[right]));
                left++;
                right--;

            }
            else if(sum<0)
            {
                left++;
            }
            else 
            {
                right--;
            }
         }
       }
       //return result;
       return new ArrayList<>(result);
    }
}
