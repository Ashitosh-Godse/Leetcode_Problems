package leetcode;
import java.util.*;
public class RomanToInteger {
	static int solution(String s) {
		int roman=0;
		Map<Character,Integer> hash=new HashMap<>();
		hash.put('I', 1);
		hash.put('V', 5);
		hash.put('X', 10);
		hash.put('L', 50);
		hash.put('C', 100);//MCMXCIV
		hash.put('D', 500);
		hash.put('M', 1000);
		for(int i=0;i<s.length();i++) {
			if(i>0 && hash.get(s.charAt(i))> hash.get(s.charAt(i-1))) {
				roman+=hash.get(s.charAt(i))-(2*hash.get(s.charAt(i-1)));
			}else {
			roman+=hash.get(s.charAt(i));
			}
		}
		return roman;
		
	}
	static String IntToRoman(int num) {
		String[] thousands=new String[] {"","M","MM","MMM"};
		String[] hundreds= {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		String[] tens={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		String[] units= {"","I","II","III","IV","V","VI","VII","VIII","IX"};
		return thousands[num/1000]+hundreds[(num%1000)/100]+tens[(num%100)/10]+units[num%10];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		/*String a=sc.nextLine();
		int result=solution(a);
		System.out.println(result);*/
		int num=sc.nextInt();
		String ans=IntToRoman(num);
		System.out.println(ans);

	}

}
