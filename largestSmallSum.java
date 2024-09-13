
import java.util.*;
import java.util.ArrayList;
public class Main
{
   public static int largestSmallSum(int arr[],int len){
       if(len==0||len<=3) return 0;
       Arrays.sort(arr);
       ArrayList<Integer> evenPos=new ArrayList<Integer>();
       ArrayList<Integer> oddPos= new ArrayList<Integer>();
       for(int i=0;i<arr.length;i++){
           if(i%2==0) evenPos.add(arr[i]);
           else oddPos.add(arr[i]);
       }
       int secondLarge=evenPos.get(evenPos.size()-2);
       int secondSmall=oddPos.get(1);
       return secondLarge+secondSmall;
   }
  
	public static void main(String[] args) {
		int arr[] = {18,2,5,3,91,23,85,10};
		int len = arr.length;
		System.out.println(largestSmallSum(arr,len));
	}
}
