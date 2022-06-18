class max_min{
    public static  int largest(int[] arr)
    {
        int large1, large2;
        large1 = large2 = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]>large1)
            {
                large2 = large1;
                large1 = arr[i];
            }
            else if(large1!=arr[i] && arr[i]>large2 )
                large2 = arr[i];
        }
        return large2;
    }
    public static int smallest(int[] arr)
    {
        int large1, large2;
        large1 = large2 = Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]<large1)
            {
                large2 = large1;
                large1 = arr[i];
            }
            else if(large1!=arr[i] && arr[i]<large2 )
                large2 = arr[i];
        }
        return large2;
    }
    public static void main(String[] args) {
        int[] arr = { 1,2,4,7,7,5};
        System.out.println(largest(arr));
        System.out.println(smallest(arr));
    }
}
