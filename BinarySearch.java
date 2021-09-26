package leetcode;

public class BinarySearch {
	static int BS(int a[],int b) {
		int low=0;int high=a.length-1;
		if(a==null || a.length==0) return -1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(a[mid]==b) return mid;
			else if(a[mid]<b) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return low;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		int res=BS(a,1);
		System.out.println(res);

	}

}
