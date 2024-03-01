class Permutation {
    public static void printPermutation(String str, String newStr) {
        if(str.equals(""))
        {
            System.out.println(newStr);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            char currChar = str.charAt(i);
            printPermutation(str.substring(0,i) + str.substring(i+1),newStr + currChar);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        printPermutation(str,"");
    }
}
