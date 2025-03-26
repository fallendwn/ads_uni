package first;
import java.util.Scanner;
public class ninth {
    /**
     * This method calculates the binomial coefficient (n, k) using recursion.
     * Time complexity: O(2^n), because the function calls itself twice for each step.
     * formula: C(n, k) = C(n-1, k-1) + C(n-1, k).
     *
     * @param n total number of elements
     * @param k number of elements chosen
     * @return binomial coefficient C(n, k)
     */
    private static int solution(int n, int k){
        if(k == 0 || n == k ){
            return 1;
        }
        return solution(n-1, k-1 ) + solution(n-1, k);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        System.out.println(solution(n, k));
    }
}
