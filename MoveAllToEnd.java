class MoveAllToEnd {
    public static String MoveToEnd(String n, String str, char ele, int idx, int count) {
        if(idx > str.length()-1)
        {
            String n1 = "";
            for(int i=0;i<count;i++)
            {
                n1 += ele;
            }
            return n+n1;
        }
        if(str.charAt(idx) == ele)
        {
            count++;
        }
        else
        {
            n = n + str.charAt(idx);
        }
        return MoveToEnd(n,str,ele,idx+1,count);
    }
    public static void main(String[] args) {
        String str = "sanath";
        String n = "";
        char ele = 'a';
        System.out.println(MoveToEnd(n,str,ele,0,0));
    }
}
