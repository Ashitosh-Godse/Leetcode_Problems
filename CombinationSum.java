package leetcode;
import java.util.*;

public class CombinationSum {
	static List<List<Integer>> sum(int[] a,int b){
		List<List<Integer>> c=new ArrayList<>();
		backtrack(a,b,new ArrayList(),c,0);
		return c;
		
	}
	static void backtrack(int[] a,int b,List<Integer> list,List<List<Integer>> res,int index) {
		if(b<0)
			return;
		if(b==0) {
			res.add(new ArrayList(list));
		}
		for(int i=index;i<a.length;i++) {
			list.add(a[i]);
			backtrack(a,b-a[i],list,res,i);
			list.remove(list.size()-1);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]= {2,2,2,3,5,1};
    int b=7;
    List<List<Integer>> sol=sum(a,b);
    System.out.println(sol);
	}

}
