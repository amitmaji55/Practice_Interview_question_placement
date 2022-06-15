import java.util.Scanner;

class V_C_W_count {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        int len = str.length();
        String vowel = "";

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
               continue;
            else
                vowel = vowel +ch;
        }
        System.out.println(vowel);
    }
}
