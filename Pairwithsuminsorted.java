public class Pairwithsuminsorted {
   static boolean RotatedSorted(int a[],int n,int x)
   {
    int i;
    for(i=0;i<n-1;i++)
    {
        if(a[i]>a[i+1])
        break;
    }
    int l = (i+1)%n;
    int r = i;
    while(l != r)
    {
        if(a[l]+a[r]==x)
        return true;
        if(a[l]+a[r]<x)
        l = (l+1)%n;
        else
        r = (n+r-1)%n;
    }
    return false;
   }
   public static void main(String args[])
   {
    int a[] = {1,2,3,4,5};
    int n=a.length-1;
    int x = 3;
    boolean e = RotatedSorted(a,n,x);
    System.out.println(e);
   }
}
