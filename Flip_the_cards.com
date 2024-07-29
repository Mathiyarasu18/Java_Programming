import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0;i<n;i++){
		    int N = sc.nextInt();
		    int Y = sc.nextInt();
		    int mid = N/2;
		    if(mid>=Y)
		       System.out.println(Y);
		    else
		       System.out.println(Math.abs(Y-N));
		}

	}
}
