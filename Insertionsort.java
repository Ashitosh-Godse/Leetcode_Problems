package leetcode;

public class Insertionsort {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,3,2,1,4,7,6};
		int n=a.length;
		for(int i=1;i<n;i++) {
			int temp=a[i];
			int j=i-1;
			while(j>=0 && a[j]>temp){
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
			
			
		}
		for(int i:a) {
			System.out.print(i+" ");
		}
	}

}
