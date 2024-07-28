class MyQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public MyQueue() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }
    
    public void push(int x) {
        stack1.push(x);
    }
    
    public int pop() {
        int size1 = stack1.size();
        for(int i=0;i<size1-1;i++) {
            stack2.push(stack1.pop());
        }
        int item = stack1.pop();
        int size2 = stack2.size();
        for(int i=0;i<size2;i++) {
            stack1.push(stack2.pop());
        }
        return item;
    }
    
    public int peek() {
        int size1 = stack1.size();
        for(int i=0;i<size1-1;i++) {
            stack2.push(stack1.pop());
        }
        int item = stack1.peek();
        int size2 = stack2.size();
        for(int i=0;i<size2;i++) {
            stack1.push(stack2.pop());
        }
        return item;
    }
    
    public boolean empty() {
        if(stack1.size() == 0) {
            return true;
        }
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
