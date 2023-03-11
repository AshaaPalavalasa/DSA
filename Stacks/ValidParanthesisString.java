import java.util.*;

public class ValidParanthesisString {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        boolean ans=ValidString(str);
        if(ans){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    public static boolean ValidString(String str){
    Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='('){
                st.push(ch);
                continue;
            }else if(st.isEmpty() && ch=='*'){
                st.push(ch);
                continue;
            }
                
            char check;
            switch(ch){
                case')': check=st.pop();
                        if(check==')'){
                            return false;
                        }
                        break;
                case'*': check=st.pop();
                        if(check==')'){
                            return false;
                        }
                        break;
            }
        }
        if(st.size()==0){
            return true;
        }
        return false;
    }

}
