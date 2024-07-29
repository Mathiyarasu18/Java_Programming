import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int age = 0;
		for(int i=0;i<n;i++){
		    int N = sc.nextInt();
		    int X = sc.nextInt();
		    int count = 0;
		    for(int j=0;j<N;j++){
		        age = sc.nextInt();
		        if(age>=X)
		          count++;
		}
		 System.out.println(count);

	}
}
}
