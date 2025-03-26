package first;
import java.util.Scanner;
public class eighth {
    private static boolean solution(String s, int iteration){
        if(iteration >= s.length()){
            return true;
        }
        if((s.charAt(iteration) >= 'a' && s.charAt(iteration) <= 'z') ||
                (s.charAt(iteration) >= 'A' && s.charAt(iteration) <= 'Z')
        ){
          return false;

        }
        return solution(s, iteration+1);
    }
    public static boolean finalSolution(String s){
        return solution(s, 0);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(finalSolution(s));


    }
}
