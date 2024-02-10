import java.util.*;
import java.lang.Math;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit1 = sc.nextInt();
        int digit2= sc.nextInt();
        int digit3 = sc.nextInt();
        int minClm1 = Math.min(digit1/100%10,Math.min(digit2/100%10,digit3/100%10));
        int minClm2 = Math.min(digit1/10%10,Math.min(digit2/10%10,digit3/10%10));
        int minClm3 = Math.min(digit1%10,Math.min(digit2%10,digit3%10));
        int result = minClm1*100+minClm2*10+minClm3;
        System.out.println(result);
    }
}
