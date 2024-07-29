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
	       int X = sc.nextInt();
	       int Y = sc.nextInt();
	       int x=X/10,y=Y/10;
	       if(X%10>0)
	           x++;
	       if(Y%10>0)
	           y++;
	       System.out.println(Math.abs(y-x));
	   }

	}
}
