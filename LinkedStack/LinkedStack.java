package Stacks.LinkedStack;

public class LinkedStack {
    private class Node{
        private Object item;
        private Node next;
        private Node(Object i,Node n){
            this.item=i;
            this.next=n;
        }
    }
    private Node top;
    private int numItems;
    public LinkedStack(){

    }
    /*
        isEmpty() - checks if the LinkedStack is empty
     */
    public boolean isEmpty() {
        return this.numItems==0;
    }
    /*
        isFull() - checks if the LinkedStack is full
     */
    public boolean isFull(){
        return false;
    }
    /*
        length() - returns the length of the LinkedStack
     */
    public int length(){
        return this.numItems;
    }
    /*
        push(Object item) - wrapper method for pushItem()
     */
    public boolean push(Object item){
        return this.pushItem(item);
    }
    /*
        pushItem(Object item) - adds a new Object item to the top of the LinkedStack
     */
    private boolean pushItem(Object item){
        if(item==null){
            throw new IllegalArgumentException();
        }
        if(this.isFull()){
            return false;
        }
        Node newNode=new Node(item,this.top);
        this.top=newNode;
        this.numItems++;
        return true;
    }
    /*
        pop() - wrapper method for popItem()
     */
    public Object pop(){
        return this.popItem();
    }
    /*
        popItem() - removes and returns the top Object from the LinkedStack
     */
    private Object popItem(){
        if(this.isEmpty()){
            return null;
        }
        Object removed=this.top.item;
        this.top=this.top.next;
        this.numItems--;
        return removed;
    }
    /*
        peek() - wrapper method for peekItem()
     */
    public Object peek(){
        return this.peekItem();
    }
    /*
        peekItem() - returns the top Object from the LinkedStack
     */
    private Object peekItem(){
        if(this.isEmpty()){
            return null;
        }
        return this.top.item;
    }
    /*
        toString() - overridden method from Object class, return a string that represents a LinkedStack object
     */
    public String toString(){
        String result="{";
        Node current=this.top;
        while(current!=null){
            result+=current.item;
            if(current.next==null){
                break;
            }
            result+=", ";
            current=current.next;
        }
        result+="}";
        return result;
    }

}
