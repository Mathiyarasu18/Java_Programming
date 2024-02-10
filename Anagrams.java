import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        
        char[] string1 = a.toLowerCase().toCharArray();
        char[] string2 = b.toLowerCase().toCharArray();
        
        java.util.Arrays.sort(string1);
        java.util.Arrays.sort(string2);
        
        return java.util.Arrays.equals(string1,string2);
        

    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
