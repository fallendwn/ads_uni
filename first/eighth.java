package first;
import java.util.Scanner;
public class eighth {
    /**
     * This method checks if a string contains only digits using recursion.
     * Time complexity: O(n), where n is the length of the string.
     * The function goes through each char and checks if it is a letter.
     * If it is a letter, it returns false.
     * If String ends, it returns true.
     *
     * @param s input string
     * @param iteration current index in the string
     * @return true if the string contains only digits, false otherwise
     */
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
