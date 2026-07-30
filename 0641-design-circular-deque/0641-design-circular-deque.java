class MyCircularDeque {
    int arr[];
    int size;
    int front;
    int rear;
    public MyCircularDeque(int k) {
        arr = new int[k];
        size = k;
        front = -1;
        rear = -1;
    }
    
    public boolean insertFront(int value) {
        if(isFull()){
            return false;
        }
        if(front == -1 || rear == -1){
            front = 0;
            rear = 0;
        }else{
       front = (front - 1 + size) % size;
        }
        arr[front] = value;
        return true;
    }
    
    public boolean insertLast(int value) {
        if(isFull()){
            return false;
        }
        if(front == -1 || rear == -1){
            front = 0;
            rear = 0;
        }else{
       rear = (rear + 1) % size;
        }
        arr[rear] = value;
        return true;
    }
    
    public boolean deleteFront() {
        if(isEmpty()){
            return false;
        }
        if(front == rear){
            front = rear = -1;
            return true;
        }
       front = (front + 1) % size ;
       return true;
    }
    
    public boolean deleteLast() {
        if(isEmpty()){
            return false;
        }
        if(front == rear){
            front = rear = -1;
            return true;
        }
        rear = (rear - 1 + size) % size;
        return true;
    }
    
    public int getFront() {
        if(isEmpty()){
            return -1;
        }
        return arr[front];
    }
    
    public int getRear() {
        if(isEmpty()){
            return -1;
        }
        return arr[rear];
    }
    
    public boolean isEmpty() {
        if(front == -1){
            return true;
        }
        return false;
    }
    
    public boolean isFull() {
        if((rear + 1) % size == front){
            return true;
        }
        return false;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */