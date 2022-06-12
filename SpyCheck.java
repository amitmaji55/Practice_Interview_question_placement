class Spy{
    public static boolean spy_check(int n)
    {
        int sum = 0;
        int prod = 1;
        int rem;
        while(n!=0)
        {
            rem = n%10;
            sum = sum+rem;
            prod = prod*rem;
            n = n/10;
        }
        if(sum==prod)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(spy_check(145));
    }
}
