class Automorphic{
    public static boolean is_automorphic(int n){
        int sq = n*n;
        while(n!=0)
        {
            if(n%10!=sq%10)
                return false;
                n /= 10;
                sq = sq/10;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(is_automorphic(76));
    }
}
