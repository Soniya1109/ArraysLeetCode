public class BuyandSell {
    public static int buysell(int a[])
    {
        int buyprice = a[0];
        int profit = 0;
        for(int i=1;i<a.length;i++)
        {
            if(a[i]<buyprice)
            buyprice = a[i];
            else
            {
                int currentprofit = a[i] - buyprice;
                profit = Math.max(currentprofit,profit);
            }
        }
        return profit;
    }
    public static void main(String args[])
    {
        int a[] = {2,3,4,5,1};
        System.out.println(buysell(a));
    }
}
