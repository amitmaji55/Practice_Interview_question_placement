class Magic_number{
    public static void main(String[] args) {
        int n = 20;
        int sum = 0, rem ;
        while(n>0 || sum>9)
        {
            rem = n%10;
            sum = sum+rem;
            n = n/10;
        }
        if(sum==1)
        {
            System.out.println("Happy Number");
        }
        else
            System.out.println("Not a happy number");
    }
}
