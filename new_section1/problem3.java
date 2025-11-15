package new_section1;

import java.util.Scanner;

/**
 * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
 * 문장속의 각 단어는 공백으로 구분됩니다.
 * 첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.
 */
public class problem3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(longestWord(input));
    }

    private static String longestWord(String input){
        String answer = "";
        int max = 0;

        String[] s = input.split(" ");
        for (String string : s) {
            if (string.length() > max) {
                max = string.length();
                answer = string;
            }
        }

        return answer;
    }
}
