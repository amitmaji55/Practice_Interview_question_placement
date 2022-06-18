class Not_repeated_array_element{

    public static void not_repeat(int[] arr)
    {
        boolean mark;
        for (int i=0;i<arr.length;i++)
        {
            mark = false;
            for (int j=0;j<arr.length;j++)
            {
                if(i!=j && arr[i]==arr[j])
                {
                    mark = true;
                }
            }
            if(!mark)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,-1,1,3,1};
        System.out.println("Non-repeating numbers are: ");
        not_repeat(arr);
    }
}
