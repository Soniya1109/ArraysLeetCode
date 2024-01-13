public class NextPermutation 
{  public static void permutation(int a[])
    {
        int n = a.length;
        int k = n-2;
        if(a.length==0 || a==null)
        return;
        for(int i =n-1;i>0;i--)
        {
            if(a[i]<=a[i-1])
            k--;
            else{
                break;
            }
        }
        if(k==-1)
        {
            reverse(a,0,n-1);
            return;
        }
        for(int i =n-1;i>0;i--)
        {
          if(a[i]>a[k])
          {
          int temp = a[k];
          a[k] = a[i];
          a[i] = temp;
          break;
          }
        
        }
        reverse(a,k+1,n-1);

    }
    static void reverse(int a[],int start,int end)
    {
        while(start<end)
        {
            int temp = a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String args[])
    {
        int a[] = {1,1,5};
        permutation(a);
    }
}
