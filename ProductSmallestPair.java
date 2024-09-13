
import java.util.*;
import java.util.ArrayList;
public class Main
{
   public static int ProductSmallestPair(int sum,int arr[]){
       int len = arr.length;
       if(len==0||len<2) return -1;
       Arrays.sort(arr);
       for(int i=0;i<len-2;i++){
         int ans=arr[i]+arr[i+1];
         if(ans<=sum) return arr[i]*arr[i+1];
       }
       return 0;
   }
  
	public static void main(String[] args) {
		int sum=9;
		int arr[] = {5,2,4,3,9,7,1};
		System.out.println(ProductSmallestPair(sum,arr));
	}
}

//Pair of least two element is (2, 1) 2 + 1 = 3 < 9, Product of (2, 1) 2*1 = 2. Thus, output is 2

