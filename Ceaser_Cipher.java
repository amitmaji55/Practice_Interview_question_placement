import java.util.Scanner;

class cipher_text{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();
        int k = sc.nextInt();

        String word = "";

        char ch2;
        for (int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch>='A' && ch<='Z')
            {
               ch2 = (char)(((int) str.charAt(i) + k- 65) % 26 + 65);
               word = word +ch2;
            }
            else if (ch>='a' && ch<='z')
            {
                ch2 = (char) (((int) str.charAt(i)+k-97) % 26 + 97);
                word = word+ch2;
            }
        }
        System.out.println(word);
    }

}
