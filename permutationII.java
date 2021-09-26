package leetcode;
import java.util.*;
public class permutationII {
	static List<List<Integer>> permute(int a[]){
		List<List<Integer>> res=new ArrayList<>();
		boolean visited[]=new boolean[a.length];
		backtrack(a,new ArrayList<>(),res,visited);
		return res;
		
	}
	static void backtrack(int a[],List<Integer> ans,List<List<Integer>> res,boolean[] visited) {
		if(ans.size()==a.length) {
			res.add(new ArrayList(ans));
		}
		for(int i=0;i<a.length;i++) {
			if(visited[i]==true) continue;
			ans.add(a[i]);
		    visited[i]=true;
		    backtrack(a,ans,res,visited);
		    ans.remove(ans.size()-1);
		    visited[i]=false;
		    while(i+1<a.length && a[i]==a[i+1]) {
		    	i++;
		    }
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,1,2};
		List<List<Integer>> r=permute(a);
		System.out.println(r);

	}

}
