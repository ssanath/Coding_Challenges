class Reverse {
    public static void Reverse(int n, String str) {
        if(n < 0)
        {
            return;
        }
        System.out.print(str.charAt(n));
        Reverse(n-1,str);
    }
    public static void main(String[] args) {
        String str = "sanath";
        Reverse(str.length()-1,str);
    }
}
