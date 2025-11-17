package new_section1;

import java.util.Scanner;

/**
 * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요
 * 첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
 * 두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
 */
public class problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        String[] question = new String[length];

        for (int i = 0; i < length; i++) {
            question[i] = sc.next();
        }

        for (int j = 0; j < length; j++) {
//            System.out.println(reverse(question[j]));
            new StringBuilder(question[j]).reverse().toString();
        }

    }

    private static StringBuilder reverse(String input) {
//        String answer = "";
        StringBuilder answer = new StringBuilder();
        for (int i = input.length()-1; i >= 0; i--) {
//            answer += input.charAt(i);
            answer.append(input.charAt(i));
        }

        return answer;
    }
}
