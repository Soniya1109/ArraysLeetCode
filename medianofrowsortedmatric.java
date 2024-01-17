// public class medianofrowsortedmatric {
//     static int binarysearch(int[] ar,int k)
//     {
//         int low = 0;
//         int high = ar.length-1;
//         int mid =0;
//         while(low<=high)
//         {
//             mid = (low+high)/2;
//             if(ar[mid]==k)
//             {
//                 return mid;
//             }
//             else if(ar[mid]<k)
//             {
//                 low = mid+1;
//             }
//             else
//             {
//                 high = mid-1;
//             }
//         }
//         return low;
//     }
//     public static findmedian(int[] matrix)
//     {
//         int min = matrix[0][0];
//         int max = matrix[0][0];
//         int medianpos = (matrix.length * (matrix[0].length-1)+1)/2;

//         for(int i =0;i<matrix.length;i++)
//         {
//             if(matrix[i][0]<min)
//             {
//                 min = matrix[i][0];
//             }
//         }

//         for(int i =0;i<matrix.length;i++)
//         {
//             if(matrix[i][matrix[0].length-1]>max)
//             {
//                 max = matrix[i][matrix[0].length-1];
//             }
//         }
//          while(min<max)
//          {
//             int mid = (min+max)/2;
//             int count =0;
//             for(int i =0;i<matrix.length;i++)
//             {
//                 int x = binarysearch(matrix[i],mid);
//                 if(x>=0)
//                 {
//                    while(matrix[i][x]==mid)
//                    {
//                     x++;
//                    }
//                 }
//                 else{
//                     x = x*-1;
//                 }
//                 count+=x;
//             }
//          if(count<medianpos)
//          {
//             min = mid+1;
//          }
//          else{
//             max = mid;
//          }
//         }
//          return min;

//     }

//     static int findcount(int[] ar,int mid)
//     {
//         int count = 0;
//         for(int i =0;i<ar.length;i++)
//         {
//             if(ar[i]<=mid)
//             {
//                 count++;
//             }
//             else{

//             }

//         }
//         return count;
//     }
// }
