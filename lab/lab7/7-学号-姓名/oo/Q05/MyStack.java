//MyStack.java
import java.util.LinkedList;

public class MyStack<T> {
    private LinkedList<T> values=new LinkedList<T>();
    public void push(T t){
        values.addFirst(t);
    }
    public T pull(){
        T t = values.getFirst();
        values.removeFirst();
        return t;
    }
    public T peek(){
        T t = values.getFirst();
        return t;
    }
    public static void main(String[] args){
        MyStack<String> array = new MyStack<>();
        array.push("わたし、どこから来たの");
        System.out.println(array.peek());
        array.push("わたし、どこへ向かうの");
        System.out.println(array.peek());
        array.push("わたしはだれ");
        System.out.println(array.peek());
        System.out.println(array.pull());
        System.out.println(array.pull());
        System.out.println(array.pull());
    }
}
