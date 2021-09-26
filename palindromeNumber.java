package leetcode;

public class palindromeNumber {
	static boolean findpalindrome(int a) {
		int reversed=0;
		int b= a;
		
		if(a<0) return false;
		else {
			 while(a!=0) {
				 reversed=reversed*10+a%10;
				 a/=10;
			 }
		}
		if(b!=reversed) {
			 return false;
		 }
		return true;
	   
			
		
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      boolean ans=findpalindrome(-212);
      System.out.println(ans);
	}

}
