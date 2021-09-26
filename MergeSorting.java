package leetcode;

public class MergeSorting {
	public static int[] mergesort(int[] a,int l,int r) {
		if(l<r) {
			int mid=(l+r)/2;
			mergesort(a, l,mid);
			mergesort(a,mid+1,r);
			merge(a,l,mid,r);
		}
		return a;
		
	}

      static void merge(int[] a, int l, int mid, int r) {
		// TODO Auto-generated method stub
	  int i=l;
	  int j=mid+1;
	  int k=l;
	  int[] b=new int[a.length];
	  while(j<=r && i<=mid) {
		  if(a[i]<a[j]) {
			  b[k]=a[i];
			  i++;
			 
		  }else {
			  b[k]=a[j];
			  j++;
		  }
		  k++;
	  }
	  if(i>mid) {
		  while(j<=r) {
			  b[k]=a[j];
			  j++;k++;
		  }
	  }
	  else {
		  while(i<=mid) {
			  b[k]=a[i];
			  i++;k++;
		  }
		  
	  }
		
	  for( k=l;k<=r;k++) {
		  a[k]=b[k];
		  
	  }
	  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[]= {5,3,2,1,4,7,6};
     int n=a.length-1;
     int[] c=mergesort(a, 0,n);
     for(int i:c) {
    	 System.out.print(i+" ");
     }
	}

}
