class Solution {
    public String frequencySort(String s) {
        StringBuilder str = new StringBuilder();
        Map<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        List<Character>[] buckets = new List[s.length()+1];
        for(int i=0;i<buckets.length;i++) {
            buckets[i] = new ArrayList<>();
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()) {
            char character = entry.getKey();
            int frequency = entry.getValue();
            buckets[frequency].add(character);
        }
        for(int i=buckets.length-1;i>=0;i--) {
            for(char c : buckets[i]) {
                for(int j=0;j<i;j++) {
                    str.append(c);
                }
            }
        }
        return str.toString();
    }
}
