public class Disarium{
 public static boolean is_disarium(int n)
 {
     int rem, sum = 0, temp, c=0;
     temp = n;
     while(n>0)
     {
         n = n/10;
         c++;
     }
     temp = n;
     while(n!=0)
     {
         rem = n%10;
         sum = sum + (int) Math.pow (rem,c);
         n = n/10;
         c--;
     }
     if(sum==temp)
         return true;
     else
         return false;
 }

    public static void main(String[] args) {
        int n = 135;
        System.out.println(is_disarium(n));
    }

}
