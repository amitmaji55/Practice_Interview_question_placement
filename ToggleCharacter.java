import java.util.Scanner;
class toggle_character{
    public static void main(String[] args) {
        String str = "PrepInsta";
        char[] str1 = str.toCharArray();
        int i =0;
        while(i<str1.length)
        {
            if(str1[i]>'A' && str1[i]<='Z')
                str1[i] = (char)(str1[i] +'a'-'A');

            else if(str1[i]>'a' && str1[i]<='z')
                str1[i] = (char) (str1[i] + 'A'-'a');
           i++;
        }
        System.out.println("Toggled string: ");
        for (i = 0; i < str.length(); i++) {
            System.out.print(str1[i]);
        }
    }
