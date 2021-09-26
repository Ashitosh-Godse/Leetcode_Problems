package leetcode;

import java.util.*;
class BeautifulString {
	static void print(String p,ArrayList<String> ans) {
		ArrayList<String> res=new ArrayList<>();
		HashMap<Character,Character> map=new HashMap<>();
		
		for(String p1:ans) {
			int cn1=0;
			
			
			for(int t=0;t<p1.length();t++) {
				if(map.containsKey(p1.charAt(t))) {
					cn1-=1;
				}
				else if(!map.containsKey(p1.charAt(t))) {
					map.put(p1.charAt(t), p1.charAt(t));
					cn1-=1;
				}
						
			}
			
			if(cn1 == 0) {
				res.add(p1);
				System.out.println(p1);
			}
			
			
		}
		
		for(String m:res) {
			System.out.print(m+" ");
		}
	}
	public static void main(String[] args) {
		ArrayList<String> ans=new ArrayList<>();
		
		
		Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				ans.add(s.substring(i,j));
			}
		}
		print(s,ans);
		
		
	}
	
}