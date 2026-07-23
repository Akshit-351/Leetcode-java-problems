class MyStack {

    Queue<Integer> q1;
    Queue<Integer> q2;

    public MyStack() {
        q1 = new ArrayDeque<>();
        q2 = new ArrayDeque<>();
    }

    public void push(int x) {
        q1.offer(x);
    }

    public int pop() {

        while(q1.size() > 1){
            q2.offer(q1.poll());
        }

        int ans = q1.poll();

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return ans;
    }

    public int top() {

        while(q1.size() > 1){
            q2.offer(q1.poll());
        }

        int ans = q1.poll();

        q2.offer(ans);     // put it back because top() should not remove it

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return ans;
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}