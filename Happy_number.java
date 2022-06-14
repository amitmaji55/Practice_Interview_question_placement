
public class Happy_Number{
    public static void main(String[] args) {
        int sum = 0, rem;
        int n = 320;
        while(n>9)
        {
            sum  = 0;
            while(n!=0)
            {
                rem = n%10;
                sum = sum+ (rem*rem);
                n = n/10;
            }
            n = sum;
        }
        if(sum==1)
        {
            System.out.println("Happy Number");
        }
        else
            System.out.println("Not a happy Number");
    }
}
