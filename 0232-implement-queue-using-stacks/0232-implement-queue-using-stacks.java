class MyQueue {
   Stack<Integer> Input;
   Stack<Integer> Output;
    public MyQueue() {
        Input = new Stack<>();
        Output = new Stack<>();
    }
    
    public void push(int x) {
        Input.push(x);
    }
    
    public int pop() {
        if(Output.isEmpty()){
            while(!Input.isEmpty()){
           Output.push(Input.pop());
    }
}
       int y =  Output.pop();
       return y;
    }
    
    public int peek() {
        if(Output.isEmpty()){
    while(!Input.isEmpty()){
        Output.push(Input.pop());
    }
}
       int peek =  Output.peek();
       return peek;
    }
    
    public boolean empty() {
       return Input.isEmpty() && Output.isEmpty();
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