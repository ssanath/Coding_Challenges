class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        String ns1 = new String(s1);
        String ns2 = new String(s2);

        return ns1.equals(ns2);
    }
}
