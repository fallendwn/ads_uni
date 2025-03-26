package first;
import java.util.Scanner;


public class fifth {

    public static long Solution(long fib1, long fib2, int i, int len){
        if (i >= len){
            return fib1;
        }
        return Solution(fib2, fib1+fib2, i+1, len);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long fib1=0,fib2=1;
        int i = 0 ;
        int n = sc.nextInt();
        System.out.println(Solution(fib1,fib2,0, n));
    }

}
