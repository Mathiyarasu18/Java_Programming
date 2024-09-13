
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
		int sum=3;
		int arr[] = {9,8,3,7,3,9};
	
		System.out.println(ProductSmallestPair(sum,arr));
	}
}
