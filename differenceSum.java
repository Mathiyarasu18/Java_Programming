public class Main
{
   public static int differenceSum(int n,int m){
       int notDivideSum=0;
       int divideSum=0;
       while(m>=1){
           if(m%n!=0){
               notDivideSum+=m;
           }
           else{
               divideSum+=m;
           }
           m--;
       }
       return notDivideSum-divideSum;
   }
  
	public static void main(String[] args) {
		int n=4;
		int m=20;
		System.out.println(differenceSum(n,m));
	}
}

/*Sum of numbers divisible by 4 are 4 + 8 + 12 + 16 + 20 = 60
Sum of numbers not divisible by 4 are 1 +2 + 3 + 5 + 6 + 7 + 9 + 10 + 11 + 13 + 14 + 15 + 17 + 18 + 19 = 150
Difference 150 – 60 = 90*/
