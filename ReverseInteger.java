package leetcode;

public class ReverseInteger {
	static int Reverse(int n) {
		long reversed=0;
		while(n!=0) {
			reversed=reversed*10+n%10;
			n/=10;
			if(reversed>Integer.MAX_VALUE||reversed<Integer.MIN_VALUE) return 0;
		}
		return (int)reversed;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=-123;
        int ans=Reverse(n);
        System.out.println(ans);
	}

}
