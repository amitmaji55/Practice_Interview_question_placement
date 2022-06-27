class CountWords
{
    public static void main(String[] args)
    {
        String input="This is most most annoying most ";
        String[] words=input.split(" ");
        int count = 0;
        for(int i=0;i<words.length;i++)
        {
            for(int j=i+1;j<words.length;j++)
            {
                if(words[i].equals(words[j]))
                {
                   count =count+1;
                    words[j]=" ";
                }
            }
            if(words[i]!="0" && count>1)
                System.out.println(words[i]); //Printing the word along with count
                count=1;
        }
    }
}
/*
String input="This is most most annoying most ";

C:\Users\SHADOW\.jdks\openjdk-16.0.2\bin\java.exe "-javaagent:E:\IntelliJ IDEA Community Edition 2021.2\lib\idea_rt.jar=11171:E:\IntelliJ IDEA Community Edition 2021.2\bin" -Dfile.encoding=UTF-8 -classpath F:\SDE_SHEET\SDE_SHEET\production\SDE_SHEET CountWords
most
 

Process finished with exit code 0

*/
