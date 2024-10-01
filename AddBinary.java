class Solution {
    public String addBinary(String a, String b) {
        int carry = 0;
        int ptrA = a.length()-1, ptrB = b.length()-1;
        StringBuilder result = new StringBuilder();
        while(ptrA>=0 || ptrB>=0) {
            if(ptrA>=0) {
                carry += a.charAt(ptrA--)-'0';
            }
            if(ptrB>=0) {
                carry += b.charAt(ptrB--)-'0';
            }
            result.insert(0,carry%2);
            carry /= 2;
        }
        if(carry == 1) result.insert(0,'1');
        return result.toString();
    }
}
