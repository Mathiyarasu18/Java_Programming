import java.util.HashMap;
import java.lang.Math;
public class Main {
	
	public static int subString(String word) {
		
		char arr[] = word.toCharArray();
		int n=arr.length;
		if(n<3)
			return n;
		int left=0,right=0;
		HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
		int maxLen = 0;
		while(right<n) {
			hm.put(arr[right], hm.getOrDefault(arr[right], 0)+1);
			while(hm.size()>2) {
				hm.put(arr[left],hm.get(arr[left])-1);
				if(hm.get(arr[left])==0) {
					hm.remove(arr[left]);
				}
				left++;
			}
			maxLen = Math.max(maxLen,right-left+1);
			right++;
		}
		return maxLen;
	}
	
	public static void main(String args[]) {
		
		String str = "ecebd";
		System.out.println(subString(str));
	}

}
