package Ch6.강의자료;

import java.util.StringTokenizer;

public class Ex09_StringTokenizerEx {

    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐", "/");

        while (st.hasMoreTokens()) // 스트링 토크나이저에 다음 토큰이 있을 경우 true 리턴
            System.out.println(st.nextToken());
    }
}
