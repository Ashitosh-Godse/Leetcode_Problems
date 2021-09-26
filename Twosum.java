package leetcode;
import java.util.*;

public class Twosum {
	static Vector<Integer> twosum(Vector<Integer> vec,int tar) {
		Vector<Integer> ans=new Vector<>();
		int i=0;
		int j=vec.size()-1;
		while(i<j) {
			if(vec.get(i)+vec.get(j)==tar) {
				ans.add(vec.get(i));
				ans.add(vec.get(j));
				break;
			}
			else if(vec.get(i)+vec.get(j)<tar) {
				i++;
				
			}
			else {
				j--;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Vector<Integer> result=new Vector<>();
		Vector<Integer> vec=new Vector<>();
		Vector<Integer> vec2=new Vector<>();
		Vector<Integer> op=new Vector<>();
		
		vec.add(5);
		vec.add(2);
		vec.add(3);
		vec.add(4);
		vec2.add(5);
		vec2.add(2);
		vec2.add(3);
		vec2.add(4);
		int array[]=new int[5];
		
		Collections.sort(vec);
		
		System.out.println(vec);
		int target=sc.nextInt();
	    result=twosum(vec,target);
	    for(int a:result) {
	    	op.add(vec2.indexOf(a));
	    }
	    System.out.println(op);
		
		
  
	}

}
