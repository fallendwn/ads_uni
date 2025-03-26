package first;
import java.util.Scanner;
public class sixth {

    private static int sixth(int number, int degree, int iteration, int basic_number){
        if(iteration >=degree){
            return number;
        }
        return sixth(number*basic_number, degree, iteration+1, basic_number);
    }
    public static int solution(int number, int degree){
        return sixth(number, degree, 1, number);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int degree = sc.nextInt();
        System.out.println(solution(number,degree));
    }
}
