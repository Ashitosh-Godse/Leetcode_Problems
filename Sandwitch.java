package leetcode;
import java.util.*;
public class Sandwitch {
	 public static int countStudents(int[] students, int[] sandwiches) {
	        Queue<Integer> q=new LinkedList<>();
	         Queue<Integer> q1=new LinkedList<>();
	        for(int num:students){
	            q.add(num);
	        }
	        for(int num:students){
	            q1.add(num);
	        }
	        for(int i=0;i<q.size();i++) {
	        	if(q.peek()==q1.peek()) {
	        		q.remove();
	        		q1.remove();
	        	}
	        	else {
	        	  int c=q.peek();
	        	  q.remove();
	        	  q.add(c);
	        		
	        	}
	        } 
	        //find(q,q1);
	        
	        
	      
	        return q.size();
	    
	        
	    }
	// static void find(Queue<Integer> q,Queue<Integer> q1) {
		 
	 //}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] students = {1,1,1,0,0,1}, sandwiches = {1,0,0,0,1,1};
		int res=countStudents(students,sandwiches);
		System.out.println(res);
	}

}
