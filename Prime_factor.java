class Main {
    public static int isprime(int n){
        if(n<2)
            return 0;
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n%i==0)
                return 0;
        }
        return 1;
    }
    public static void main(String[] args)
    {
        int n = 100;
        for(int i = 2; i<= n; i++){
            if(isprime(i)==1){
                int x = n;
                while(x%i==0){
                    System.out.print(i + " ");
                    x /= i;
                }
            }
        }
    }
}
