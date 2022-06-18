class Reverse_the_array{
public static void array_reverse(int[] arr)
{
    int low = 0;
    int high = arr.length-1;
    while(low<=high)
    {
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
        low++;
        high--;
    }
}
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5};
        array_reverse(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
