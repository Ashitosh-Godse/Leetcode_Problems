package leetcode;
import java.util.*;
public class foursum {
     static List<List<Integer>> forsum(int[] num,int target){
    	 List<List<Integer>> ans=new ArrayList<>();
    	 
    	 int size=num.length;
    	 if(num==null || size<4) {
    		 return ans;
    	 }
    	 Arrays.sort(num);
    	 
    		 for(int i=0;i<size-3;i++){
    			 if(i>0 && num[i]==num[i-1]) continue;
    			 for(int j=i+1;j<size-2;j++) {
    				 if(j<i+1 && num[j]==num[j-1]) continue;
    				 int left=j+1; int right=size-1;
    				 while(left<right) {
    					 
    					 int sum=num[i]+num[j]+num[left]+num[right];
    					 if(sum==target) {
    						 List<Integer> res=new ArrayList<>();
    						 res.add(num[i]); res.add(num[j]);res.add(num[left]);res.add(num[right]);
    						 ans.add(res);
    						 left++;
    						 right--;
    						 while(left<right && num[left]==num[left-1]) {
    							 left++;
    						 }
    						 while(left<right && num[right]==num[right+1]) {
    							 right--;
    						 }
    						 
    					 }
    					 else if(sum>target) right--;
    					 else left++;
    					 
    				 }
    			 }
    			 
    		 }
    		 return ans;
    	 }
    	 
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,0,-1,0,-2,2};
		List<List<Integer>> ans=forsum(a,0);
		System.out.println(ans);
		
		
    
	}

}
