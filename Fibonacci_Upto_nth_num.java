import java.util.Scanner;

class Fibonacci_Upto_nthNUm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");
        for (int i = 1; i <= n; ++i)
        {
            System.out.print(a + ", ");
        int c = a + b;
            a= b;
            b = c;
        }
    }
}
