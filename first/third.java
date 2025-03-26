package first;
import java.util.Scanner;
public class third {
    public static boolean solution(int a, boolean answer, int i ){
        if (i >=a/2){
            return answer;
        }
        if (a%i==0){
            return false;
        }
        return solution(a, answer, i+1);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(solution(a, true, 2));

    }
}
