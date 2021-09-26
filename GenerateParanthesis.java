package leetcode;
import java.util.*;

public class GenerateParanthesis {
	static List<String> generate(int n){
		List<String> ans=new ArrayList<>();
		Set<Integer> hash=new HashSet<>();
		
		
		backtrack("",n,0,0,ans);
		return ans;
		
		
	}
	static void backtrack(String s,int max,int open,int close,List<String> ans) {
		if(s.length()==max*2) {
			ans.add(s);
			return;
		}
		
		if(open<max) backtrack(s+"(",max,open+1,close,ans);
		if(close<open) backtrack(s+")",max,open,close+1,ans);
		//ans[],2,0,0,"" o==0:0<2:"(":ans[],2,1,0,"("  ||  o==1:1<2:"((":ans[],2,2,0,"(("
		//"(())"
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<String> res=generate(n);
		System.out.println(res);

	}

}
