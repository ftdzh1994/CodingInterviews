class CQueue {
    Stack<Integer> stk;
    public CQueue() {
        stk = new Stack<>();
    }
    
    public void appendTail(int value) {
        Stack<Integer> tmp = new Stack<>();
        while (!stk.isEmpty()) {
            tmp.push(stk.pop());
        }
        tmp.push(value);
        while (!tmp.isEmpty()) {
            stk.push(tmp.pop());
        }
    }
    
    public int deleteHead() {
        return stk.isEmpty() ? -1 : stk.pop();
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */