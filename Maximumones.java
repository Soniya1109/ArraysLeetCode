// class Maximumones
// {
//     public static int findmaximum(int[][] ar,int n,int m)
//     {
//         int col = m-1;
//         int row = -1;

//         for(int i =0;i<n;i++)
//         {
//             for(int j =col;j>=0;j--)
//             {
//                 if(ar[i][j]==1)
//                 {
//                     row = i;
//                     j--;
//                 }
//                 else{
//                     break;
//                 }
//             }
//         }
//         return row;
//     }
// }