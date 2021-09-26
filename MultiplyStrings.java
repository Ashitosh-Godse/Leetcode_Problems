package leetcode;

import java.util.Arrays;

public class MultiplyStrings {
	static String Multiply(String n1,String n2) {
		String res="";
		char a[]=n1.toCharArray();
		char b[]=n2.toCharArray();
		int m=a.length;
		int n=b.length;
		char c[]=new char[m+n];
		Arrays.fill(c,'0');
		
		for(int i=m-1;i>=0;i--) {
			for(int j=n-1;j>=0;j--) {
				int product=(a[i]-'0')*(b[j]-'0');
				int temp=c[i+j+1]-'0'+product;
				c[i+j+1]=(char)(temp % 10+'0');
                c[i+j]=(char)(c[i+j]-'0'+ temp/10+'0');
			}
		}
			StringBuilder sb=new StringBuilder();
			boolean seen=false;
			for(char e:c) {
				if(e=='0' && !seen) continue;
				sb.append(e);
				seen=true;
			}
			return  sb.length()== 0?"0":sb.toString();
		}
	
	
		
		
		
		
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s=Multiply("6","5");
		 System.out.println(s);
	}

}
