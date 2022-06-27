import java.util.Scanner;

class pair_vowel{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();
       int c = 0;
       int n = str.length();
       for (int i=0;i<n-1;i++) {
            char ch = str.charAt(i);
            char ch2 = str.charAt(i + 1);
           if ((ch == 'A' || ch == 'E' || ch == 'I'|| ch == 'O'|| ch == 'U') &&
                   (ch2 == 'A' || ch2 == 'E' || ch2 == 'I'|| ch2 == 'O'|| ch2 == 'U')){
                    System.out.println(" "+ch+ch2);
                   c++;
                }
            }
        System.out.println(c);
    }
}
/*
C:\Users\SHADOW\.jdks\openjdk-16.0.2\bin\java.exe "-javaagent:E:\IntelliJ IDEA Community Edition 2021.2\lib\idea_rt.jar=7298:E:\IntelliJ IDEA Community Edition 2021.2\bin" -Dfile.encoding=UTF-8 -classpath F:\SDE_SHEET\SDE_SHEET\production\SDE_SHEET pair_vowel
Enter the string : 
THE GOAT WILL EAT WHEAT
 OA
 EA
 EA
3

Process finished with exit code 0
*/
