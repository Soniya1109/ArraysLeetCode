import java.util.Map;
import java.util.*;
public class ContainsDuplicate {
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4};
        System.out.println(containskey(arr));
    }
    static boolean containskey(int arr[])
    {
        Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++)
        {
        if(hm.containsKey(arr[i]))
        {
            return true;
        }
        else{
            hm.put(arr[i],i);
        }
        }
        return false;


    }
}
