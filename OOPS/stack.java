public class stack {
    private int elements;
    private int top;
    private int[] array;

    stack(int elements){
        this.elements=elements;
        this.array=new int[elements];
        this.top=-1;
    }

    boolean underflow(){
        if (top==-1){
            System.out.println("UnderFlow");
            return true;
        }
        return false;
    }

    void push(int data){
        this.array[++top]=data;
    }
    void pop(){
        if (!this.underflow()) --top;
    }
    void show(){
        if (!this.underflow()) System.out.println(this.array[top]);
    }





    public  static void main(String args[]){
        stack stack1=new stack(5);
        stack1.show();
        stack1.push(23);
        stack1.show();
        stack1.pop();
        stack1.show();
        stack1.pop();
    }
}
