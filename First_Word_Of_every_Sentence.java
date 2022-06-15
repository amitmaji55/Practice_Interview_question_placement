import java.util.Scanner;

class Print_First_character_sentence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str  = sc.nextLine();
        System.out.println(str.charAt(0));

        for (int i=1;i<str.length();i++)
        {
            char ch = str.charAt(i) ;
            if(ch==' ')
            {
                char ch2 = str.charAt(i+1);
                System.out.print(ch2+ " ");
            }
        }
    }
}
