import java.util.Scanner;

public class problem3_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sourceDay = in.nextInt();
        int targetDay = in.nextInt();

        int[] salesArray = new int[sourceDay];
        for (int i = 0; i < sourceDay; i++) {
            salesArray[i] = in.nextInt();
        }

        int max = 0;
        for (int i = 0; i < targetDay; i++) {
            max += salesArray[i];
        }

        int tmp = max;

        for (int i = targetDay; i < sourceDay; i++) {
//            System.out.println("salesArray[i] = " + salesArray[i]);
//            System.out.println("salesArray = " + salesArray[i-targetDay]);
            tmp += salesArray[i] - salesArray[i - targetDay];
//            System.out.println(i + ":" + tmp);
            if (tmp > max) {
                max = tmp;
            }
        }

        System.out.println(max);

    }
}