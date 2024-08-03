class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> romanMap = new HashMap<>();
        int num=0,i=0;
        romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);
        romanMap.put('M',1000);

        while(i<s.length()) {
            if(i < s.length()-1 && romanMap.get(s.charAt(i)) < romanMap.get(s.charAt(i+1))) {
                num += romanMap.get(s.charAt(i+1)) - romanMap.get(s.charAt(i));
                i += 2;
            }
            else {
                num += romanMap.get(s.charAt(i));
                i += 1;
            }
        }

        return num;
    }
}
