package leetcode;

public class strstr {
	static int StrStr(String s,String p) {
		if(p.isEmpty()) return 0;
		int m=s.length();
		int n=p.length();
		if(m<n) return -1;
		for(int i=0;i<=m-n;i++) {
			int j;
			for(j=0;j<n;j++) {
				if(s.charAt(i+j)!=p.charAt(j)) {
					break;
				}
				
			}
			if(j==n) {
				return 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s="hello";
      String p="el";
      int res=StrStr(s,p);
      System.out.println(res);
      
      
	}

}
