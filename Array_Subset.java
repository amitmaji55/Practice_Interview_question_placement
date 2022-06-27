import java.net.Inet4Address;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Array_Subset_Checker{
    public static boolean find_subset(int[] arr1, int[] arr2)
    {
            int m  = arr1.length;
             int n = arr2.length;

         HashSet<Integer> ob = new HashSet<>();
         for (int i=0;i<m;i++)
         {
             if(!ob.contains(arr1[i]))
             {
                ob.add(arr1[i]);
             }
         }
         for (int i=0;i<n;i++)
         {
             if(!ob.contains(arr2[i]))
             {
                 return false;
             }

         }
        return true;
    }

    public static void main(String[] args)
    {
      int  arr1[] = {11, 1, 13, 21, 3, 7};
       int arr2[] = {11, 3, 7, 1};
       int m = arr1.length;
       int n = arr2.length;
        System.out.println(find_subset(arr1,arr2));

    }
}
