import java.util.*; 
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputNumber = sc.nextInt();
		int arr[] = new int[10];
		int count=0;
		if (inputNumber>1&&inputNumber<25000)
		{
		    while(inputNumber!=0)
		    {
		        int rem = inputNumber%10;
		        arr[rem]++;
		        inputNumber/=10;
		    }
		    for(int i=0;i<=9;i++){
		        if(arr[i]>=1)
		        count++;
		    }
		}
		System.out.println(count);
		
	}
}
