package leetcode;

import java.util.Arrays;
import java.util.*;

public class codeChef {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int t=sc.nextInt();
     sc.nextLine();
     int z=0;
     String[] p=new String[t];
     while(t-->0) {
    	
     
     int a,b,c,d,e;
     String[] s=sc.nextLine().split(" ");
     a=Integer.parseInt(s[0]);
     b=Integer.parseInt(s[1]);
     c=Integer.parseInt(s[2]);
     d=Integer.parseInt(s[3]);
     e=Integer.parseInt(s[4]);
     int[] l= {a,b,c};
     int i=0;
 	int j=1;
 	int k=2;
 	
 	if(l[i]+l[j]<=d && l[k]<=e) {
 		p[z++]="YES";
 	}
 	else if(l[i]+l[k]<=d && l[j]<=e) {
 		p[z++]="YES";
 	}
 	else if(l[i]+l[k]<=d && l[i]<=e) {
 		p[z++]="YES";
 	}
 	else {
 		p[z++]="NO";
 	}
 	
 	
    	 0  
       
	}
     for(String x:p) {
    	 System.out.println(x);
     }
	}
}
