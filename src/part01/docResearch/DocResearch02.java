package part01.docResearch;

import java.util.Scanner;

/*
세준이는 영어로만 이루어진 어떤 문서를 검색하는 함수를 만들려고 한다.
이 함수는 어떤 단어가 총 몇 번 등장하는지 세려고 한다. 그러나, 세준이의 함수는 중복되어 세는 것은 빼고 세야 한다.
예를 들어, 문서가 abababa이고, 그리고 찾으려는 단어가 ababa라면, 세준이의 이 함수는 이 단어를 0번부터 찾을 수 있고, 2번부터도 찾을 수 있다.
그러나 동시에 셀 수는 없다.
세준이는 문서와 검색하려는 단어가 주어졌을 때, 그 단어가 최대 몇 번 중복되지 않게 등장하는지 구하는 프로그램을 작성하시오.
 */
public class DocResearch02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String doc = sc.nextLine();
        String word = sc.next();

        int count = 0;
        int startIndex = 0;

        while (true) {
            int findIndex = doc.indexOf(word, startIndex);
            if (findIndex < 0)
                break;
            count++;
            startIndex += findIndex + word.length();
        }

        System.out.println(count);
    }
}
