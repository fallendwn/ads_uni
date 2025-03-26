package first;
import java.util.Scanner;
public class tenth {
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
