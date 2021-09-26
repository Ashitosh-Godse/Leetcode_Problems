package leetcode;
import java.util.*;
import java.util.Arrays;

public class MediansOfTwoArrays {
    static float findMedian(int a[],int b[]) {
    	float sum=0;
    	float median=0;
    	Arrays.sort(a);
    	Arrays.sort(b);
    	HashSet<Float> hash=new HashSet<>();
    	for(float e:a) {
    		hash.add(e);
    	}
    	for(float e:b) {
    		hash.add(e);
    	}
    	for(float e: hash) {
    		sum+=e;
    	}
    	median=sum/hash.size();
    	
    	return median;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]= {1,3};
      int b[]= {2};
      float m=findMedian(a,b);
      System.out.println(m);
	}

}
