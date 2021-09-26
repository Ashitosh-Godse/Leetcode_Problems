package leetcode;

public class RemoveElement {
	static int find(int[] a,int val) {
		int index=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=val) {
				a[index]=a[i];
				index++;
			}
		}
		
		for(int e:a) {
			System.out.print(e+" ");
		}
		System.out.println();
		return index;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {0,1,1,2,2,2,3};
		int ans=find(a,1);
		System.out.println(ans);
	
		
		
		
				
				
			
		
		
	}

}
