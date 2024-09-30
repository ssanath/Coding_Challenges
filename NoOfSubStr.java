class Solution
{
    long substrCount (String S, int K) {
        return KSubStr(S,K) - KSubStr(S,K-1);
    }
    long KSubStr(String S, int K) {
        HashMap<Character,Integer> map = new HashMap<>();
        long count = 0L;
        int start = 0, end = 0;
        while(end < S.length()) {
            map.put(S.charAt(end), map.getOrDefault(S.charAt(end),0)+1);
            while(map.size() > K) {
                map.put(S.charAt(start),map.get(S.charAt(start))-1);
                if(map.get(S.charAt(start)) == 0) map.remove(S.charAt(start));
                start++;
            }
            count += (long) (end-start+1);
            end++;
        }
        return count;
    }
}
