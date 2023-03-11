import java.util.*;

public class PreviousGreaterElement {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[n];
        st.push(arr[0]);
        ans[0]=-1;
        for(int i=1;i<n;i++){
            while(st.size()>0 && st.peek()<=arr[i]){
                    st.pop();
            }
            if(st.size()==0){
				ans[i]=-1;
			} else{
				ans[i]=st.peek();
			}
            st.push(arr[i]);
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
