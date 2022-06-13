class Smallest_Number_in_digit{
    public static void main(String[] args) {
        int n = 2475;
        int smallest = n%10;
        while(n>0)
        {
            int rem = n%10;
            if(smallest>rem)
            {
                smallest = rem;
            }
            n = n/10;
        }
        System.out.println(smallest);
    }
}
