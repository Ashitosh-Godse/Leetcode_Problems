package leetcode;
import java.util.*;

public class BracketProblem {
	static boolean isvalid(String s) {
		Stack<Character> st=new Stack<>();
		if(s==null) return true;
		for(char e:s.toCharArray()) {
			if(e=='(' || e=='{' || e=='[') {
				st.push(e);
			}
			
			
			else if(!st.isEmpty() &&((e==']' && st.peek()=='[')||
					(e==')' && st.peek()=='(')||
					(e=='}' && st.peek()=='{'))){
				    st.pop();
				}
			else {
				st.push(e);
			}
			
			}
		if(st.isEmpty()) { 
			return true;
		}
		return false;
	}	
				

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="[()]{[()()]()}";
		boolean res=isvalid(s);
		System.out.println(res);
		

	}

}
