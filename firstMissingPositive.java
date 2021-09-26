package leetcode;

public class firstMissingPositive {
	static int find(int[] a) {
		int n=a.length;
		for(int i=0;i<n;i++) {
			int curr=a[i]-1;
			while(1<a[i] && a[i]<=n && a[i]!=a[curr]) {
				int temp=a[i];
				a[i]=a[curr];
				a[curr]=temp;
				curr=a[i]-1;
				
			}
			
		}
		for(int i=0;i<n;i++) {
			if(i+1!=a[i]) return i+1;
		}
		return n;
	}
	public static void main(String[] args) {
		int a[]= {2,3,1,-1};
		int ans=find(a);
		System.out.println(ans);
		
	}

}
