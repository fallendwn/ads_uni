package first;
import java.util.Scanner;


public class fifth {
    /**
     * This method calculates the Fibonacci number using recursion.
     * Time complexity: O(n), where n is the position in the sequence.
     * The function adds the last two numbers to find the next one.
     *
     * @param fib1 first number in sequence
     * @param fib2 second number in sequence
     * @param i current number (step)
     * @param len total steps to calculate
     * @return Fibonacci number N
     */

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
