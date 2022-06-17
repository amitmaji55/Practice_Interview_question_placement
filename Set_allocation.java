class set_allocation_problem {
    public static  int calculate(int n)
    {
        int sum = 0, rem;
        while(n!=0)
        {
            rem = n%10;
            sum = sum +rem;
            n = n/10;
        }
        if(sum>=1 && sum<=26)
            return sum;
        else
            return calculate(n);
    }

    public static void main(String[] args) {
        int n = 1234;
       int res = calculate(n) +64;
       char ch = (char) res;
        System.out.println("Allocated set number is : "+ch);

    }

}
