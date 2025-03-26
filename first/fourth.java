package first;
import java.util.Scanner;

public class fourth {
    /**
     * This method finds the factorial of a number using recursion.
     * Time complexity: O(n), where n is the given number.
     * The function multiplies numbers from 1 to n.
     *
     * @param n current factorial result
     * @param i current number in recursion
     * @param a original number
     * @return factorial of the number
     */
    public static long solution(long n, int i, int a){
        if (i>=a){
            return n;
        }
        return solution(n, i+1, a) * i;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(solution(a, 1, a));


    }

}
