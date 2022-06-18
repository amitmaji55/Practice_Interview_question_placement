import java.util.*;
class Remove_dupliacte_from_unsorted_array {

    static void removeDuplicates(int[] arr) {
        HashMap<Integer, Integer> ob = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!ob.containsKey(arr[i])) {
                System.out.print(arr[i] + " ");
                ob.put(arr[i], 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 2, 3, 3};
        removeDuplicates(arr);
        }
    }
