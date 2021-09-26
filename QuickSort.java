package leetcode;

public class QuickSort {
	public static int[] sort(int[] a,int l,int h) {
		if(l<h) {
			int pivot=partition(l, h, a);
			sort(a, l, pivot-1);
			sort(a, pivot+1, h);
		}
		
		return a;
		
	}
	public static int partition(int l,int h,int[] a) {
		int pivot=a[l];
		int i=l;
		int j=h;
		while(i<j) {
		while(a[i]<=pivot) i++;
		while(a[j]>pivot) j--;
		if(i<j) {
			swap(a,i,j);
		}
		}
		swap(a,j,l);
		return j;
	}
	static void swap(int[] a,int i,int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a= {5,4,2,3,7};
        int n=a.length-1;
        int[] ans=sort(a,0,n);
        for(int ele:a) {
        	System.out.print(ele+"");
        }
	}

}
