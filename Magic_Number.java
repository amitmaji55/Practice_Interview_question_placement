class Magic_Number{

    public static void main(String[] args) {
        int n = 199999;
        int rem;
        int sum = 0;
        while (n > 9) {
            sum = 0;
            while (n != 0) {
                rem = n % 10;
                n = n / 10;
                sum = sum + rem;
            }
            n = sum;
        }
        if (sum == 1)
            System.out.println("Magic Number");
        else
            System.out.println("Not Magic Number");
    }
}
