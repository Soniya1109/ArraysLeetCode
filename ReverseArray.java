public class ReverseArray {
    static void reverse(int arr[])
    {
        int i=0,j=arr.length-1;
        while(i<=j)
        {
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j] =temp;
            i++;
            j--;
        }
    }
    public static void main(String args[])
    {
        int arr[] ={2,3,4,5,6};
        for(int i =0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        reverse(arr);
        System.out.println();
        for(int i =0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }


    }
}
