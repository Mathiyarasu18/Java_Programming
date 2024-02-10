import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int string_sum = A.length() + B.length();
        System.out.println(string_sum);
        if (A.charAt(0)>B.charAt(0))
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        String str1 = A.substring(0,1).toUpperCase();
        String str = A.substring(1);
        String str1_result = str1+str;
        String str2 = B.substring(0,1).toUpperCase();
        String strr = B.substring(1);
        String str2_result = str2+strr;
        System.out.print(str1_result +" "+ str2_result);
    }
}
