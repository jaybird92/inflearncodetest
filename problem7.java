import java.util.Scanner;

public class problem7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String problem = in.next();
        char [] problemArray = problem.toLowerCase().toCharArray();
        String answer = "YES";
        int lt = 0;
        int rt = problem.length() -1;
        while (lt < rt) {
            if(problemArray[lt]==problemArray[rt]){
                lt ++;
                rt --;
            }else{
                answer = "NO";
                break;
            }
        }
        System.out.println(answer);

    }

}