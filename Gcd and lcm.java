class Main {
    public static void main(String[] args) {
      int ans = 1;
      int n1 = 4;
      int n2 = 8;
      for (int i=1;i<=Math.min(n1,n2);i++)
      {
          if(n1%i==0 && n2%i==0)
              ans = i;
      }
      int lcm = (n1*n2)/ans;
        System.out.println("GCD IS : "+ans);
        System.out.println("LCM IS : "+lcm);
    }
}
