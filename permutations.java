package leetcode;
import java.util.*;

public class permutations {
	public static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> res=new ArrayList<>();
		boolean visited[]=new boolean[nums.length];
		
		backtrack(nums,new ArrayList<>(),res,visited);
		return res;
	}
	static void backtrack(int[] nums,List<Integer> ans,List<List<Integer>> res,boolean visited[]) {
		if(nums.length<=0) return;
		if(ans.size()==nums.length) {
			res.add(new ArrayList(ans));
			return;
		}
		for(int i=0;i<nums.length;i++) {
			if(visited[i]==true) continue;
			ans.add(nums[i]);
			visited[i]=true;
			backtrack(nums,ans,res,visited);
			ans.remove(ans.size()-1);
			visited[i]=false;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3};
		List<List<Integer>> r=permute(nums);
		System.out.println(r);
	}

}
