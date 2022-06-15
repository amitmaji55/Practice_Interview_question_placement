import java.util.Scanner;

class V_C_W_count{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        int len = str.length();
        int vowel = 0, conso = 0, word = 0;

        for (int i=0;i<len;i++){
            char ch= str.charAt(i);
            if(str.charAt(i)==' ' && str.charAt(i+1)==' ')
            {
                word++;
            }
            if(ch=='a' || ch=='e' || ch=='i'|| ch=='o'|| ch=='u'){
                vowel++;
            }
           else if(ch>='a' && ch<='z')
            {
                conso++;
            }
           if(str.charAt(i)==' ' && str.charAt(i+1)==' ')
           {
               word++;
           }
        }
        System.out.println("vowels : "+vowel);
        System.out.println("Consonants : "+conso);
        System.out.println("Words : "+word);

    }
}
