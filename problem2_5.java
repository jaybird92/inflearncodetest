import java.util.Scanner;

public class problem2_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int length = in.nextInt();

        int counter = 0;
        int[] numArray = new int[length + 1];

        for (int i = 2; i <= length; i++) {
            if (numArray[i] == 0) {
                counter++;
                for (int j = i; j <= length; j=j+i) {
                    numArray[j]=1;
                }
            }
        }

        System.out.println(counter);

    }

}