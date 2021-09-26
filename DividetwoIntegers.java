package leetcode;

public class DividetwoIntegers {
    static int divide(int dividend,int divisor) {
    	if(dividend==Integer.MIN_VALUE && divisor==-1) return Integer.MAX_VALUE;
    	 int a=Math.abs(dividend);
    	 int b=Math.abs(divisor);
    	 int res=0;
    	
    	 while(a-b>=0) {
    		 int x=0;
    		 while(a-(b<<1<<x)>=0) {
    			 x++;
    		 }
    		 res+=1<<x;
    		 a-=b<<x;
    	 }
    	return ((dividend>=0) && (divisor>=0)) ||((dividend<=0) && (divisor<=0)) ? res:-1*res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int op=divide(10,3);
     System.out.println(op);
	}

}
