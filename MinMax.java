import java.util.*;

//Time complexcity = o(nlogn)
//Space Complexcity = o(1)

class Pair
{
    public int min;
    public int max;
}

class MinMax
{
    static Pair getMinMax(int arr[],int n)
    {
          Pair p = new Pair();
          Arrays.sort(arr);
          p.min = arr[0];
          p.max = arr[n-1];
          return p;

    }
    public static void main(String args[])
    {
        int arr[] = {100,2000,350,450};
        int arr_size = arr.length;
        Pair p = getMinMax(arr,arr_size);
        System.out.println("Maximum"+p.max);
        System.out.println("Minimum"+p.min);

    }
}