package first;
import java.util.Scanner;
public class tenth {
    /**
     * This method calculates the greatest common divisor (GCD) using recursion.
     * Time complexity: O(log(min(a, b))).
     * It follows the Euclidean algorithm: GCD(a, b) = GCD(b, a % b).
     *
     * @param a first number
     * @param b second number
     * @return GDC(the greatest common divisor) of a and b
     */
    private static int solution(int a, int b){
        int temp = a-b*(a/b);
        if (temp == 0){
            return b;
        }

        return solution(a = b, b = temp);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(solution(a,b));
    }
}
