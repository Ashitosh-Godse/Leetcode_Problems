package leetcode;
import java.util.*;

import java.util.Map.Entry;
public class EqualStrings {
	
     static void frequencyCount(String s,List<String> y) {  //function to count each character
    	Map<Character,Integer> freqcount=new LinkedHashMap<>();
    	List<Integer> a=new ArrayList<Integer>();
    	
    	s.replace(" ", "");
    	int count=0;
    	freqcount.put('a', 0);
    	freqcount.put('b', 0);
    	freqcount.put('c', 0);
    	char c[]=new char[s.length()];
    	for(int i=0;i<c.length;i++) {
    		if(freqcount.containsKey(c[i])) {
    			freqcount.put(c[i],(Integer) freqcount.get(c[i])+1);
    		}
    		
    	}
    	
    	Iterator<Entry<Character, Integer>>iterator=freqcount.entrySet().iterator();
    	while(iterator.hasNext()) {
    		Entry<Character, Integer>entry=iterator.next();
    		a.add(entry.getValue());
    		
    	}
    	
    	boolean ans=findequality(a);
    	//System.out.println(ans);
    	if(ans==true) {
    		y.add(s);
    	}
    	
    	
    	
    	//System.out.println(freqcount);
    }
    
     
    static boolean findequality(List<Integer> k) {  ///function for checking that count of each character in String is equal or not
    	for(int i=1;i<k.size();i++) {
    		if(k.get(i)!=k.get(i-1)) {
    			return false;
    		
    		}
    	}
    		return true;
    	
    }
    
    static boolean check(String m,Set<Character> z) { //function for checking that String contains all different char present in String
    	Set<Character> n=new HashSet<>();
    	
    	for(char c:m.toCharArray()) {
    		n.add(c);
    	}
    	boolean v=n.equals(z);
    	
    	return v;
    	
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> x=new ArrayList<>();
		List<String> y=new ArrayList<>();
		Set<Character> z=new HashSet<>();
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		int cnt=0;
		
		z.add('a');
		z.add('b');
		z.add('c');
		//System.out.println(z.size());
		
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				x.add(s.substring(i,j));
			}
		}
		
		for(String p:x) {                       //abacbcba
			
			frequencyCount(p,y);
			}
		
		for(String m:y) {
			boolean istrue=check(m,z);
			if(istrue) {
				System.out.print(m+" ");
			}
	}

	}}