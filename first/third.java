package first;
import java.util.Scanner;
public class third {


    /**
     * This method checks if a number is prime using recursion.
     * Time complexity: O(sqrt(n)), where n is the given number.
     * The function checks if the number is divisible by smaller numbers.
     *
     * @param a number to check
     * @param answer true if prime, false otherwise
     * @param i current divisor
     * @return true if the number is prime, false otherwise
     */
    public static boolean solution(int a, boolean answer, int i ){
        if (i >=a/2){
            return answer;
        }
        if (a%i==0){
            return false;
        }
        return solution(a, answer, i+1);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(solution(a, true, 2));

    }
}
