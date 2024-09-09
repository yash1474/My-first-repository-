

class Stack{
    final static int MAX=1000;
    int top;
    int arr[]=new int[MAX];
    Stack(){
        top=-1;
    }
    boolean isEmpty(){
        return (top<0);
    }
    boolean push(int x){
        if(top>=MAX-1){
            return false;
        }
        arr[++top]=x;
        return true;
    }
    int pop(){
        if(top<0){
            System.out.println("stack is empty");
            return -1;
        }
        else{
            int x=arr[top--];
            return x;
        }
    }
    int peek(){
        if(top<0){
            System.out.println("stack is empty");
            return -1;
        }
        return arr[top];

    }
    void display(){
        for(int i=0;i<=top;i++){
            System.out.print(arr[i]+" ");
        }
    }


}
public class w5q4 {
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(35);
        st.push(13);
        st.push(29);
        st.push(23);
        st.push(9);
        System.out.println("Stack has following elements ");
        st.display();
        System.out.println("\n"+st.pop()+" is popped from stack");
        System.out.println("Top element in Stack is "+st.peek());
        System.out.println("Now elements present in stack are ");
        st.display();


    }

}
