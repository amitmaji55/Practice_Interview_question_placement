class Cycliaclly_Rotate_the_array{
public static void array_rotate(int[] arr)
{
    int low = 0;
    int high = arr.length-1;
    while(low!=high)
    {
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
        low++;
    }
}
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5};
        array_rotate(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
