public class Push_Zero_to_End {

    public static void move_zeroes(int[]  arr)
    {
        int n = arr.length;
        int count = 0;
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[count++] = arr[i];
            }
        }
        while(count<n)
        {
            arr[count++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,7,0,5,0,6,5};
        move_zeroes(arr);
        for (int i=0;i<arr.length;i++)
        System.out.print(arr[i]+ " ");


    }
}
