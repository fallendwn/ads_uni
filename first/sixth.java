package first;
import java.util.Scanner;
public class sixth {
    /**
     * This method calculates a number raised to a power using recursion.
     * Time complexity: O(n), where n is the exponent.
     * The function multiplies the base number by itself n times.
     *
     * @param number base number
     * @param degree exponent
     * @param iteration current step in recursion
     * @param basic_number original base number
     * @return result of number in degree
     */
    private static int answer(int number, int degree, int iteration, int basic_number){
        if(iteration >=degree){
            return number;
        }
        return answer(number*basic_number, degree, iteration+1, basic_number);
    }

    public static int solution(int number, int degree){

        return answer(number, degree, 1, number);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int degree = sc.nextInt();
        System.out.println(solution(number,degree));
    }
}
