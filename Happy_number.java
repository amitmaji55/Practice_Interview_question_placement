class Happy_Number{
    public static int calculate(int n)
    {
        int sum = 0;
        while (n!=0)
        {
            int rem = n%10;
            sum = sum + (rem*rem);
            n = n/10;
        }
        return sum;
    }
    public static  boolean is_happy_number(int n)
    {
        int temp = n;
        while(temp>9)
        {
            temp=calculate(n);
        }
        if(temp==1)
            return true;
        return false;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(is_happy_number(n));
    }
}
