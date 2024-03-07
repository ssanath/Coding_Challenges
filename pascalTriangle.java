class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pasTri = new ArrayList<>();
        pasTri.add(new ArrayList<>(List.of(1)));
        if(numRows == 1)
        {
            return pasTri;
        }
        pasTri.add(new ArrayList<>(List.of(1,1)));
        for(int i=2;i<numRows;i++)
        {
            List<Integer> prevList = new ArrayList<>(pasTri.get(pasTri.size()-1));
            List<Integer> newList = new ArrayList<>();
            newList.add(1);
            for(int j=0;j<prevList.size()-1;j++)
            {
                newList.add(prevList.get(j)+prevList.get(j+1));
            }
            newList.add(1);
            pasTri.add(newList);
        }
        return pasTri;
    }
}
