package first;
import java.util.Scanner;
public class ninth {
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
