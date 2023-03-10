import java.util.*;

public class Basicoperations{

    static class Pair{
        int a;
        int b;
        Pair(int a,int b){
            this.a=a;
            this.b=b;
        }
        Pair(){
            this.a=0;
            this.b=0;
        }

        @Override
        public String toString(){
            return "(" + a + "," + b + ")";
        }
    }
    public static void main(String[] args){
        Stack<Integer>  st=new Stack<>();

        //pushes the data into the stack
        st.push(10);
        st.push(20);

        //returns the top value in stack
        System.out.println(st.peek());

        //deletes and returns the top value in the stack
        System.out.println(st.pop());

        //returns the size of stack
        System.out.println(st.size());

        //checks if the stack is empty
        System.out.println(st.isEmpty());

        st.pop();

        System.out.println(st.isEmpty());

        System.out.println("=============================================");
        Stack<Pair> st2=new Stack<>();
        st2.push(new Pair(1,2));
        st2.push(new Pair(3,4));
        st2.push(new Pair(5,6));

        System.out.println(st2.peek());

    }
}