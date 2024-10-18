class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
        if(s.size() == 0) return s;
        int top = s.pop();
        sort(s);
        insertInSortedStack(top,s);
        return s;
    }
    public void insertInSortedStack(int element, Stack<Integer> s) {
        if(s.size() == 0 || s.peek() <= element) {
            s.push(element);
            return;
        }
        int top = s.pop();
        insertInSortedStack(element,s);
        s.push(top);
    }
}
