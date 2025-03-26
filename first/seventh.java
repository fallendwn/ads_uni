package first;
import java.util.Scanner;
public class seventh {
    private static int[] solution(int[] arr, int length, int[] final1, int iteration){
        if(iteration>=length){
            return final1;
        }
        final1[iteration] = arr[length-iteration-1];
        return solution(arr, length, final1, iteration+1);
    }

    public static int[] trueSolution(int[] arr, int length){
        int[] final1 = new int[length];
        solution(arr, length, final1, 0);
        return final1;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for(int i = 0; i < length; i++){
            arr[i] = sc.nextInt();
        }
        arr = trueSolution(arr, length);
        for(int i = 0; i < length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
