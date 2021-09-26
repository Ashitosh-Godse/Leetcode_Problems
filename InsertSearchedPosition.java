package leetcode;

public class InsertSearchedPosition {
	static int find(int[] a,int b) {
		boolean found=true;
		for(int i=0;i<a.length;i++) {
			if(a[i]==b) return i;
			  found=true;
			}
        if(found!=true){
            for(int i=0;i<a.length;i++){
                
				if(a[i]>b && b>a[i-1]) {
					return i;
					
					
				}
				else if(a[i]<b && b<a[i+1]) {
					return i+1;
				}
				
			
            }
            
        }
		
		return a.length;
		 
    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]= {1,3,5,7};
      int b=2;
      int res=find(a,b);
      System.out.println(res);
	}

}
