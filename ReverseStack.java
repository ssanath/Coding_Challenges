class Solution
{ 
    static void reverse(Stack<Integer> s) {
        if(s.size() == 0) return;
        int top = s.pop();
        reverse(s);
        insertAtBottom(top,s);
    }
    static void insertAtBottom(int element, Stack<Integer> s) {
        if(s.size() == 0) {
            s.push(element);
            return;
        }
        int top = s.pop();
        insertAtBottom(element,s);
        s.push(top);
    }
}
