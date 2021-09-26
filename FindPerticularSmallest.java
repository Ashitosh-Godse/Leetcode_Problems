package leetcode;
import java.util.*;

public class FindPerticularSmallest {
	static int findsmallest(int[] a,int k) {
		PriorityQueue<Integer> p=new PriorityQueue<>();
		for(int i=0;i<k;i++) {
			p.add(a[i]);
		}
		for(int i=k;i<a.length;i++) {
			if(a[i]>p.peek()) {
				p.poll();
				p.add(a[i]);
			}
		}
		return p.peek();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {20,10,60,30,50,40};
		
		int smallest=findsmallest(a,4);
		System.out.println(smallest);

	}

}
