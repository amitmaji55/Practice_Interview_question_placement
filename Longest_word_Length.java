import java.util.Scanner;
class Longest_Word_and_length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str  = sc.nextLine();
        str = str + " ";
        int len = str.length();
      String word = "", longest = "";

      for (int i=0;i<len;i++)
      {
          char ch = str.charAt(i);
          if(ch==' ')
          {
              if(word.length()>longest.length())
              {
                  longest = word;
              }
              word = "";
          }
          else {
              word = word +ch;
          }
      }
        System.out.println(longest);
        System.out.println("length of the word is : "+longest.length());
    }
}
