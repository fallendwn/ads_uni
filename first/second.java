package first;
import java.util.Scanner;
public class second {
    /**
     * This method calculates the average number of the sequence through recursion.
     * Time complexity: O(n), where n is the amount of numbers in sequence.
     * Recursive algorithm sums all the numbers in the sequence and returns the average of them.
     *
     *
     * @param arr array with the numbers
     * @param answer contains the answer
     * @param i counts iteration to finish recursion
     * @return average number of given sequence
     */
    public static double solution(int[] arr, double answer, int i){
        if (i>=arr.length){
            return answer/i;
        }
        return solution(arr,answer+=arr[i], i+1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b = new int[a];
        for(int i = 0 ; i < a ; i++){
            b[i] = sc.nextInt();
        }
        System.out.println(solution(b, 0, 0));


    }
}
