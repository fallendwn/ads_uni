package first;
import java.util.Scanner;
public class second {
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
