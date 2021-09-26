package leetcode;
import java.util.*;
public class Nropes {
	static int findcost(int[] a){
		PriorityQueue<Integer> p=new PriorityQueue<>();
		for(int i=0;i<a.length;i++) {
			p.add(a[i]);
		}
		int ans=0;
		while(p.size()>1) {
			int first=p.poll();
			int second=p.poll();
			int cost=first+second;
			ans+=cost;
			p.add(cost);
			
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,5,4,8,6,9};
		int ans=findcost(a);
		System.out.println(ans);
		

	}

}
