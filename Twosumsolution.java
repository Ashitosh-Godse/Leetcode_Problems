package leetcode;
import java.util.*;

public class Twosumsolution {
	static int[] twosum(int a[], int target) {
		HashMap<Integer,Integer> ans=new HashMap<>();
		
		for(int i=0;i<a.length;i++) {
			
			Integer diff=(Integer)(target-a[i]);
			
			if(ans.containsValue(diff)) {
				int toreturn[]= {ans.get(diff),i};
				return toreturn;
			}
			ans.put(a[i], i);
			System.out.println(ans);
			
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,1,2,5,7};
		int b[]=twosum(a,9);
		for(int e:b) {
			System.out.println(e);
		}

	}

}
