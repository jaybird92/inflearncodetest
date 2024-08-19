import java.util.Scanner;

public class problem2_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int length = in.nextInt();
        int[] aRSP = new int[length];
        int[] bRSP = new int[length];

        for (int i = 0; i < length; i++) {
            aRSP[i] = in.nextInt();
        }

        for (int i = 0; i < length; i++) {
            bRSP[i] = in.nextInt();
        }

        for (int i = 0; i < length; i++) {
            if (aRSP[i] - bRSP[i] == 0) {
                System.out.println("D");
            } else if (aRSP[i] - bRSP[i] == 1) {
                System.out.println("A");
            } else if (aRSP[i] - bRSP[i] == -2) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        }
    }

}