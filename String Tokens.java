import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        ArrayList<String> list=new ArrayList<>();
        String temp="";
        int count=0,flag=0,flag2=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ' || s.charAt(i)=='!' || s.charAt(i)==',' || s.charAt(i)=='?' || s.charAt(i)=='.' || s.charAt(i)=='_' || s.charAt(i)=='\'' || s.charAt(i)=='@')
            {
                // flag=1;
                if(flag==0 && flag2==1)
                   {
                       ++count;
                       list.add(temp);
                   }
                temp="";
                flag=1;
                
            }
            else{
                flag2=1;
                flag=0;
                temp+=s.charAt(i);
                if(i==s.length()-1 && flag==0){
                  list.add(temp);  
                  count++;
                } 
            }
            
        }
        System.out.println(count);
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }
}
