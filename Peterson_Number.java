class Peterson{

   static boolean is_peterson(int n)
    {
        int temp = n;
        int rem , sum = 0;
        while(n!=0)
        {
            int fact = 1;
            rem = n%10;
            for (int i=1;i<=rem;i++)
            {
                fact = fact*i;
            }
            sum = sum+fact;
            n = n/10;
        }
        if(sum !=temp) {
            return false;
        }
        else
                 return true;

    }
    public static void main(String[] args) {
        System.out.println(is_peterson(145));
    }
}
