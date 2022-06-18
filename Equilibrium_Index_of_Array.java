class equilibrium{
    public static void main(String[] args) {
        int[] arr = {2, 3, -1, 8, 4};
        int lsum ,rsum ;
        for (int i=0;i<arr.length;i++)
        {
            lsum = 0;
            for (int j=0;j<i;j++)
            {
                lsum += arr[j];
            }
            rsum = 0;
             for (int j=i+1;j<arr.length;j++)
             {
                 rsum += arr[j];
             }
             if(lsum==rsum)
                 System.out.println(i);
        }
    }
}
