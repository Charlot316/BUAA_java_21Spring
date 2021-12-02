//请用LinkedList实现一个支持泛型的栈MyStack，并在main函数中测试
import java.util.LinkedList;

public class MyStack<T> {
    private LinkedList<T> values=new LinkedList<T>();
    public void push(T t){
    	values.addLast(t);
    }
    public T pull(){
    	T t = null;
    	if(values.size()>0&&values!=null) {
	    	t=values.getLast();
	    	values.removeLast();
    	}
        return t;
    }
    public T peek(){
    	if(values.size()>0&&values!=null)
	    	return values.getLast();
		return null;
    }
    public static void main(String[] args){
    	MyStack<String> stack1=new MyStack<String>();
    	stack1.push("a");
    	stack1.push("b");
    	stack1.push("c");
    	System.out.println(stack1.peek());
    	stack1.pull();
    	System.out.println(stack1.peek());
    	stack1.pull();
    	System.out.println(stack1.peek());
    	stack1.pull();
    	System.out.println(stack1.peek());
    	MyStack<Integer> stack2=new MyStack<Integer>();
    	stack2.push(11);
    	stack2.push(13);
    	stack2.push(14);
    	System.out.println(stack2.peek());
    	stack2.pull();
    	System.out.println(stack2.peek());
    	stack2.pull();
    	System.out.println(stack2.peek());
    	stack2.pull();
    	System.out.println(stack2.peek());
    }
}