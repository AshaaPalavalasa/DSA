import java.util.*;
public class BalancedBrackets {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        boolean ans=checkbrackets(str);
        if(ans){
            System.out.print("YES");
        }else{
            System.out.print("No");
        }
    }

    public static boolean checkbrackets(String str) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='('|| ch=='[' || ch=='{'){
                st.push(ch);
                continue;
            }
            if(st.isEmpty()){return false;}
            char check;
            switch(ch){
                case')':check=st.pop();
                        if(check=='['||check=='{'){
                            return false;
                        }
                        break;
                case']':check=st.pop();
                        if(check=='('||check=='{'){
                            return false;
                        }
                        break;
                case'}':check=st.pop();
                        if(check=='['||check=='('){
                            return false;
                        }
                        break;
            }
        }
        return true;
    }
}
