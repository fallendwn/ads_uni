package first;
import java.util.Scanner;
public class assignment {
    /**
     * This method returns the smallest number in the sequence through recursion.
     * Time complexity: O(n), where n is the amount of numbers in sequence.
     * Recursive algorithm iterates through all numbers in array and keeps the smallest in variable
     * named: answer
     *
     * @param arr array with the numbers
     * @param answer contains the answer
     * @param i counts iteration to check every number in array
     * @return the lowest number in the array
     *
     *
     */
    public static int solution(int[] arr, int answer, int i){
        if (i>=arr.length){
            return answer;
        }
        if (answer>arr[i]){
            answer = arr[i];
        }
        return solution(arr, answer, i+1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b = new int[a];
        for(int i = 0 ; i < a ; i++){
            b[i] = sc.nextInt();
        }
        System.out.println(solution(b, b[0], 0));

    }
}
