class Maximum_Sum_Subarray{
    public static void main(String[] args) {
        int[] arr = {-3, -4, 5, -1, 2, -4, 6, -1};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i=0;i<n;i++)
        {
            sum = sum +arr[i];
            if(sum>max)
            {
                max = sum;
            }
            if(sum<0) {
                sum = 0;
            }
        }
        System.out.println(max);
    }
}
