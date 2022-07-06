import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of month : ");
        int month = sc.nextInt();
        System.out.println("Enter the year : ");
        int year = sc.nextInt();
        if((month==2&&year%4==0)||(year%100==0 && year%400==0 ))
            System.out.println("29 days in the month");
        else if (month==2)
            System.out.println("28 days in the month");
        else if( month==1 ||month==3|| month==5|| month==7|| month==8|| month==9|| month==10|| month==12)
            System.out.println("31 days in the month");
    else
            System.out.println("30 days in the month");
    }
}
