// import java.util.*;
// public class Combinations {
//     static <List<List<Integer>> combine(int N,int k)
//     {
//         <List<List<Integer>> subsets = new ArrayList<>();
//         generateCombinations(1,n,new ArrayList(),subsets,k);
//         return subsets;
//     }
//     void generateCombinations(int start,int n,List<Integer> current,List<List<Integer>> subsets,int k)
//     {
//         if(current.size() == k)
//         {
//         subsets.add(new ArrayList(current));
//         return;
//         }
//         for(int i=start;i<=n;i++)
//         {
//             current.add(i+1);
//             generateCombinations(1,n,new ArrayList(),subsets,k);
//             current.remove(current.size()-1);
//         }
        
//     }
    
// }
