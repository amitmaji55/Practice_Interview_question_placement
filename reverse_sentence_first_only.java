import java.util.Scanner;

class reverse_sentence_first_only{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();
        str = " "+str;
        String word = "";
        for (int i=str.length()-1;i>=0;i--)
        {
            char ch = str.charAt(i);
            if(ch==' ') {
                System.out.print(word+" ");
                word = "";
            }
            else{
                word = ch + word;
            }
        }
    }

}
