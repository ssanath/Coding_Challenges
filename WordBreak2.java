import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static ArrayList<String> wordBreak(String s, ArrayList<String> dictionary) {
        Set<String> wordDict = new HashSet<>(dictionary);
        ArrayList<String> result = new ArrayList<>();
        Map<Integer, ArrayList<String>> memo = new HashMap<>();
        ArrayList<String> sentences = backtrack(s, wordDict, 0, memo);
        result.addAll(sentences);
        return result;
    }
    
    private static ArrayList<String> backtrack(String s, Set<String> wordDict, int start, Map<Integer, ArrayList<String>> memo) {
        if (memo.containsKey(start)) {
            return memo.get(start);
        }
        
        ArrayList<String> sentences = new ArrayList<>();
        
        if (start == s.length()) {
            sentences.add("");
            return sentences;
        }
        
        for (int end = start + 1; end <= s.length(); end++) {
            String word = s.substring(start, end);
            if (wordDict.contains(word)) {
                ArrayList<String> subSentences = backtrack(s, wordDict, end, memo);
                for (String sub : subSentences) {
                    if (sub.isEmpty()) {
                        sentences.add(word);
                    } else {
                        sentences.add(word + " " + sub);
                    }
                }
            }
        }
        
        memo.put(start, sentences);
        
        return sentences;
    }
}
