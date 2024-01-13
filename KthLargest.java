// public class Solution{
//     public:
//     int findKthLargest(vector<int>& nums,int k)
//     {
//         priorityqueue<int,vector<int>,greater<int>> minpq;
//         for(int i=0;i<num.size();i++)
//         {
//             if(minpq.size()<k)
//             {
//                 minpq.push(nums[i]);
//             }
//             else{
//                 if(minpq.top()<num[i])
//                  minpq.pop();
//                 minpq.push(nums[i]);
         
//             }
//         }
//         return minpq.top();
//     }
// }

