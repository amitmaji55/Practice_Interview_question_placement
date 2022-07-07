class Main {
    public static String String_Captialize(String str , int x) {
        StringBuffer sb = new StringBuffer(str);
        for (int i=0;i<x;i++)
        {
            if(i==0 || i==x-1 && (int) str.charAt(i-1)>=97)
            {
                sb.setCharAt(i,(char)((int)str.charAt(i)-32));
            }
            else if(str.charAt(i)==' ')
            {
                if(((int)str.charAt(i-1)-32)>=65)
                {
                    sb.setCharAt(i-1,(char)((int)str.charAt(i-1)-32));
                }
                if(((int)str.charAt(i+1)-32)>=65)
                {
                    sb.setCharAt(i+1,(char)((int)str.charAt(i+1)-32));
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "take u forward is awesome";
        int size = str.length();

        System.out.println("String after capitalizing the first and last letter of each word of the string: ");
        System.out.println(String_Captialize(str, size));
    }
}
