package leetcode;

// Java program to find largest substring
// having count of 1s more than count
// count of 0s.
import java.util.HashMap;

class TYFirstAssignment
{

	// Function to find longest substring
	// having count of 1s more than count
	// of 0s.
	static int findLongestSub(String bin)
	{
		int n = bin.length(), i;               //"1010010"

		// To store sum.
		int sum = 0;                               //sum (key),i(value)

		// To store first occurrence of each
		// sum value.
		HashMap<Integer,
				Integer> prevSum = new HashMap<>();

		// To store maximum length.
		int maxlen = 0;
 
		// To store current substring length.
		int currlen;
		for (i = 0; i < n; i++)
		{

			// Add 1 if current character is 1
			// else subtract 1.
			if (bin.charAt(i) == '0')               //sum=1 i=0  || sum=1 i=2 || sum=0 i=5
				sum++;
			else
				sum--;   //sum=0 i=1  sum=0 i=3 sum=-1,i=4 

			// If sum is positive, then maximum
			// length substring is bin[0..i]
			if (sum > 0)
			{
				maxlen = i + 1;            //maxlen=2+1
			}

			// If sum is negative, then maximum
			// length substring is bin[j+1..i], where
			// sum of substring bin[0..j] is sum-1.
			else if (sum <= 0)
			
			{
				if (prevSum.containsKey(sum - 1))         
				{
					currlen = i - (prevSum.get(sum - 1) == null ? 1 :  //5-4=1
								prevSum.get(sum - 1));
					maxlen = Math.max(maxlen, currlen);
				}
			}

			// Make entry for this sum value in hash
			// table if this value is not present.
			if (!prevSum.containsKey(sum))
				prevSum.put(sum, i);             // 1:0 || 0:1 ||-1:4
		}
		return maxlen;
	}

	
	public static void main(String[] args)
	{
		String bin = "10010";
		System.out.println(findLongestSub(bin));
	}
}



