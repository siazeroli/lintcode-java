//Implement Queue by Stacks
/*As the title described, you should only use two stacks to implement a queue's actions.

The queue should support push(element), pop() and top() where pop is pop the first(a.k.a front) element in the queue.

Both pop and top methods should return the value of first element.

Example
For push(1), pop(), push(2), push(3), top(), pop(), you should return 1, 2 and 2

Challenge
implement it by two stacks, do not use any other data structure and push, pop and top should be O(1) by AVERAGE.*/
//tag: stack, queue

public class Solution {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;
    private boolean isIn;

    public Solution() {
       // do initialization if necessary
       stack1 = new Stack<Integer>();
       stack2 = new Stack<Integer>();
       //in state is ready to pop or top
       //not in state is ready to push
       isIn = false;
    }
    
    public void push(int element) {
        // write your code here
        transferOut();
        stack1.push(element);
    }

    public int pop() {
        // write your code here
        transferIn();
        Integer num = new Integer(stack2.pop());
        return num;
    }

    public int top() {
        // write your code here
        transferIn();
        Integer num = new Integer(stack2.pop());
        stack2.push(num);
        return num;
    }
    
    private void transferIn(){
        if(!isIn){
            while(!stack2.empty()){
                Integer i = new Integer(stack2.pop());
            }
            
            while(!stack1.empty()){
                stack2.push(new Integer(stack1.pop()));
            }
            isIn = true;
        }
    }
    
    private void transferOut(){
        if(isIn){
            while(!stack1.empty()){
                Integer i = new Integer(stack1.pop());
            }
            
            while(!stack2.empty()){
                stack1.push(new Integer(stack2.pop()));
            }
            isIn = false;
        }
    }
}
