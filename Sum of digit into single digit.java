import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    int number = sc.nextInt();
	    int sum=0, sum1=0;
	    if(number>0){
	        while(number!=0){
	            int rem = number%10;
	            sum = sum+rem;
	            number = number/10;
	        }
	    if(sum>10){
	        while(sum!=0){
	        int rem1 = sum%10;
	        sum1 = sum1+rem1;
	        sum = sum/10;
	    }
	    }
	    System.out.println(sum1);
			}
}
}
