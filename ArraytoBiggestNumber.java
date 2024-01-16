// import java.util.*;
// public class ArraytoBiggestNumber {
//     static void biggestnumber(Vector<String> arr)
//     {
//         Collections.sort(arr, new comparator<String>()
//         {
//             @Override public int compare(String X,String Y)
//             {
//                   String XY = X+Y;
//                   String YX = Y+X;

//                   return XY.compareTo(YX)>0 ?-1 : 1;

//             }
            
//         });
//         Iterator it = arr.iterator();
//         while(it.hasNext())
//         System.out.println(it.next());
//     }
//     public static void main(String args[])
//     {
//         Vector<String> arr = new Vector<>();
//         arr.add("54");
//         arr.add("546");
//         arr.add("548");
//         arr.add("60");

//         biggestnumber(arr);
//     }
// }
