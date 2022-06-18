class max_product_subarray{
    public static void main(String[] args) {
        {
            int[] arr = {1,2,3,4,5,0};
            int res = arr[0];
            for (int i=0;i<arr.length;i++) {
                int mul = arr[i];
                for (int j = i + 1; j < arr.length; j++) {
                        res = Math.max(res,mul);
                        mul = arr[j]*mul;
                }
            }
            System.out.println(res);
        }
    }
}
