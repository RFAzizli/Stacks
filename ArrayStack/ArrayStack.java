package Stacks.ArrayStack;

public class ArrayStack {
    private Object[] items;
    private int numItems;
    private int top;

    /*
        ArrayStack(int maxSize) - constructor that initializes local variables and sets the size of items array to maxSize
     */
    public ArrayStack(int maxSize){
        if(maxSize < 0){
            throw new IllegalArgumentException();
        }
        this.items=new Object[maxSize];
        this.top=-1;
        this.numItems=0;
    }
    /*
        isEmpty() - checks if the ArrayStack is empty
     */
    public boolean isEmpty() {
        return this.numItems==0;
    }
    /*
        isFull() - checks if the ArrayStack is full
     */
    public boolean isFull(){
        return this.numItems==this.items.length;
    }
    /*
        length() - returns the length of the ArrayStack
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
        pushItem(Object item) - adds an Object item to the top of the ArrayStack
     */
    private boolean pushItem(Object item){
        if(item==null){
            throw new IllegalArgumentException();
        }
        if(this.isFull()){
            return false;
        }
        this.top++;
        this.items[top]=item;
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
        popItem() - removes and then returns the top item from the ArrayStack
     */
    private Object popItem(){
        if(this.isEmpty()){
            return null;
        }
        Object removed=this.items[this.top];
        this.items[this.top]=null;
        this.top--;
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
        peekItem() - returns the top item from the ArrayStack
     */
    private Object peekItem(){
        if(this.isEmpty()){
            return null;
        }
        return this.items[this.top];
    }
    /*
        toString() - overridden method from Object class that returns a string representing ArrayStack object
        Will return a string that contains items from top to bottom
     */
    public String toString(){
        String result="{";
        for(int i=this.top;i>=0;i--){
            result+=this.items[i];
            if(i==0){
                break;
            }
            result+=", ";
        }
        result+="}";
        return result;
    }
}
