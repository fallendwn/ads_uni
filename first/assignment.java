package first;
import java.util.Scanner;
public class assignment {

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
