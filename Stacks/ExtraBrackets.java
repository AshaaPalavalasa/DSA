import java.util.*;

class ExtraBrackets{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==')'){
                if(st.peek()=='('){
                    break;
                }
                while(st.peek()!='('){
                st.pop();
                }
                st.pop();
            }
            else{
            st.push(str.charAt(i));
            }
        }
        if(st.isEmpty()){
            System.out.print("false");
        }else{
            System.out.print("true");
        }
    }
}