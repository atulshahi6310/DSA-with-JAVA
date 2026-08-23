class MinStack {
    Stack<ArrayList<Integer>> s = new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int value) {
       ArrayList<Integer> l = new ArrayList<>();
       if(s.isEmpty()){
        l.add(value);
        l.add(value);
       }else{
        int min = Math.min(s.peek().get(1),value);
        l.add(value);
        l.add(min);
       }
       s.push(l);
    }
    
    public void pop() {
        s.pop();
    }
    
    public int top() { 
       return  s.peek().get(0);
    }
    
    public int getMin() {
       return  s.peek().get(1);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */