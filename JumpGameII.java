package leetcode;

public class JumpGameII {
	static int jumps(int a[]) {
		int n=a.length;
		int jump=1;
		if(n==1 || a[0]==0) return 0;
		
		int farthest=a[0];
		int curr_end=a[0];
		
		for(int i=1;i<n;i++) {
			if(i==n-1) {
				return jump;
			}
			farthest=Math.max(farthest, i+a[i]);
			System.out.println(farthest+" "+curr_end);
			if(i==curr_end) {
				jump++;
				curr_end=farthest;
			}
		}
		
		return jump;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[]= {2,3,1,1,4};
     int res=jumps(a);
     System.out.println(res);
	}

}
