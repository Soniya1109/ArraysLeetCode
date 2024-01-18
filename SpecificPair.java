import java.io.*;
import java.util.*;
public class SpecificPair {
    public static int specificpair(int mat[][],int n)
    {
        int maxvalue = Integer.MIN_VALUE;
        for(int a =0;a<n-1;a++)
        {
            for(int b =0;b<n-1;b++)
            {
                for(int d = a+1;d<n;d++)
                {
                    for(int e = b+1;e<n;e++)
                    {
                        if(maxvalue <(mat[d][e] - mat[a][b]))
                        {
                            maxvalue = mat[d][e] - mat[a][b];
                        }
                    }
                }
            }
        }
        return maxvalue;
    }
    public static void main(String args[])
    {
        int n = 3;
        int mat[][] = {{1,2,3,4},
                       {2,4,6,7}};
        System.out.println(specificpair(mat, n));
    }
}
