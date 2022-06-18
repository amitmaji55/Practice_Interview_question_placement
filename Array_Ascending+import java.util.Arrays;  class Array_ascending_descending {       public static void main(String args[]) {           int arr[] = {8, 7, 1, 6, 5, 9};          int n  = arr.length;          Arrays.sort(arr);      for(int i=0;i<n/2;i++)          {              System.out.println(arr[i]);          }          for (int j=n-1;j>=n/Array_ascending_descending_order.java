import java.util.Arrays;

class Array_ascending_descending {

     public static void main(String args[]) {

         int arr[] = {8, 7, 1, 6, 5, 9};
         int n  = arr.length;
         Arrays.sort(arr);
     for(int i=0;i<n/2;i++)
         {
             System.out.println(arr[i]);
         }
         for (int j=n-1;j>=n/2;j--)
         {
             System.out.println(arr[j]);
         }

     }
 }
