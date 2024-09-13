public class Main
{
    public static int[] resultArray(int arr[],int n,int m){
        for(int i=0;i<arr.length;i++){
            int diff=arr[i]-n;
            if(diff<m){
                arr[i]+=1;
            }
        }
        return arr;
    }
	public static void main(String[] args) {
		
		int arr[] = {3,6,4,9,6,1};
		int n=6;
		int m=4;
		int[] res=resultArray(arr,n,m);
		for(int i=0;i<res.length;i++){
		    System.out.print(res[i]+" ");
		}
	}
}
/*
Input : 5
        2 1 4 5 7 
        3 2
Output : 3 2 5 5 7
*/
