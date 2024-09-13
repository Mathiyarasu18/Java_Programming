public class Main
{
   public static int count(int arr[],int len,int num,int diff){
       int count=0;
       for(int i=0;i<len;i++){
           int ans=arr[i]-num;
           if(ans<0)
               ans*=-1;
           if(ans<=diff)
               count++;
   }
   return count;
   }
  
	public static void main(String[] args) {
		
		int arr[] ={14,12,16,3,7,21};
		int length = arr.length;
		int num=20;
		int diff=7;
		System.out.println(count(arr,length,num,diff));
	}
}
