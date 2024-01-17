// class SpiralOrder
// {
//     public static List<Integer> spiralorder(int[][] matrix)
//     {
//         ArrayList<Integer> result = new ArrayList<Integer>();

//         int top =0,left =0;
//         int bottom = matrix.length - 1;
//         int right = matrix[0].length - 1;

//         while(top<=bottom && left<=right)
//         {
//             for(int i = left;i<=right;i++)
//             {
//                 result.add(matrix[top][i]);
//             }
//             top++;

//             for(int i = top;i<=bottom;i++)
//             {
//                 result.add(matrix[i][right]);
//             }
//             right--;

//             if(!(top<=bottom && left<=right))
//             {
//                 break;
//             }

//             for(int i =right;i>=left;i--)
//             {
//                 result.add(matrix[bottom][i]);
//             }
//             bottom--;

//             for(int i = bottom;i>=top;i--)
//             {
//                 result.add(matrix[i][left]);
//             }
//             left++;
//         }
//           return result;
//     }
//     public static void main(String args[])
//     {
//         int[][] matrix = {{1,2,3,4},
//                           {5,6,7,8},
//                            {12,14,34,23}};
//         List<Integer> spiralorder = spiralorder(matrix);
//         System.out.println(matrix);
//     }
// }