import java.util.Stack;

class CQueue {
    Stack s1 = new Stack<Integer>();// 设为主栈
    Stack s2 = new Stack<Integer>();// 设为辅助栈
    public CQueue() {
        
    }

    public void appendTail(int value) {
        this.s1.push(Integer.valueOf(value));
    }

    public int deleteHead() {
        if(!s1.empty()){
            while (!s1.empty())
                s2.push(s1.pop());
            int result=(int)s2.pop();
            while(!s2.empty()) s1.push(s2.pop());
            return result; 
        }        
        return -1;
    }
}
