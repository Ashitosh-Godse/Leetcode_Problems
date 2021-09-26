package leetcode;
import java.util.*;

public class UniqueValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,1,2,3};
		/*ArrayList<Integer> ans=new ArrayList<>();
		for(int e:a) {
			ans.add(e);
		}
		System.out.println(ans);
		HashSet<Integer> hash=new HashSet<>(ans);
		System.out.println(hash);
		System.out.println(hash.size());*/
		
		int index=1;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				a[index]=a[i+1];
				index++;
				
			}
		}
		System.out.println(index);

	}

}
