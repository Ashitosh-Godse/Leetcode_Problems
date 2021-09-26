package leetcode;
import java.util.*;

public class GroupOfAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
    	List<List<String>> res=new ArrayList<>();
    	Map<String,List<String>> hash=new HashMap<>();
    	for(String curr:strs) {
    		char[] character=curr.toCharArray();
    		Arrays.sort(character);
    		String sorted=new String(character);
    		if(!hash.containsKey(sorted)) {
    			hash.put(sorted, new ArrayList<>());
    		}
    		hash.get(sorted).add(curr);
    	}
    	res.addAll(hash.values());
    	
		return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		List<List<String>> r=groupAnagrams(strs);
		System.out.println(r);
	}

}
