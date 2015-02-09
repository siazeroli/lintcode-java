//Min Stack
/*Implement a stack with min() function, which will return the smallest number in the stack.

It should support push, pop and min operation all in O(1) cost.

Note
min operation will never be called if there is no number in the stack

Example
Operations: push(1), pop(), push(2), push(3), min(), push(1), min() Return: 1, 2, 1*/
//tag: stack

public class Solution {
    
    ArrayList<Integer> list;
    
    public Solution() {
        // do initialize if necessary
        list = new ArrayList<Integer>();
    }

    public void push(int number) {
        // write your code here
        list.add(number);
    }

    public int pop() {
        // write your code here
        Integer num = new Integer(list.get(list.size()-1));
        list.remove(list.size()-1);
        return num;
    }

    public int min() {
        // write your code here
        if(list.size()==0){
            return -999999;
        }
        Iterator<Integer> iter = list.iterator();
        Integer min = new Integer(iter.next());
        while(iter.hasNext()){
            Integer num = new Integer(iter.next());
            if(num <= min){
                min = num;
            }
        }
        return min;
    }
}
