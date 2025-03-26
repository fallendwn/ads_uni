package first;
import java.util.Scanner;

public class fourth {
    public static long solution(long n, int i, int a){
        if (i>=a){
            return n;
        }
        return solution(n, i+1, a) * i;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(solution(a, 1, a));


    }

}
