class Solution {
    public int repeatedStringMatch(String a, String b) {
        int len_a = a.length();
        int len_b = b.length();
        int n = len_b/len_a;
        int cnt = n;
        String na = "";
        while(cnt != 0) {
            na += a;
            cnt--;
        }
        if(kmp(na,b)) {
            return n;
        }
        na += a;
        if(kmp(na,b)) {
            return n+1;
        }
        na += a;
        if(kmp(na,b)) {
            return n+2;
        }
        return -1;
    }
    public int[] computeTemporaryArray(String pattern){
        int [] lps = new int[pattern.length()];
        int index =0;
        for(int i=1; i < pattern.length();){
            if(pattern.charAt(i) == pattern.charAt(index)){
                lps[i] = index + 1;
                index++;
                i++;
            }else{
                if(index != 0){
                    index = lps[index-1];
                }else{
                    lps[i] =0;
                    i++;
                }
            }
        }
        return lps;
    }
    public boolean kmp(String text, String pattern){      
        int lps[] = computeTemporaryArray(pattern);
        int i=0;
        int j=0;
        while(i < text.length() && j < pattern.length()){
            if(text.charAt(i) == pattern.charAt(j)){
                i++;
                j++;
            }else{
                if(j!=0){
                    j = lps[j-1];
                }else{
                    i++;
                }
            }
        }
        if(j == pattern.length()){
            return true;
        }
        return false;
    }
}
