/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack.and.queue;

import stack.and.queue.stack.Node;
import stack.and.queue.stack.Queue;
import stack.and.queue.stack.stack;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {

        Node newNode= new Node("wael");
        Node newNode2= new Node("ahmad");
        Node newNode3= new Node("yazan");
        Queue newstack=new Queue();
        newstack.enqueue(newNode);
        newstack.enqueue(newNode2);
        newstack.enqueue(newNode3);

        System.out.println(newstack);
newstack.dequeue();
        System.out.println(newstack);
    }
}