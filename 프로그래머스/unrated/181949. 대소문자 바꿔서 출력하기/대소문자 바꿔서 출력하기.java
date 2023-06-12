import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        String a = sc.next(); // 입력받을 값
        String answer = ""; // return할 결과
        
        // 1. 입력받은 값을 char형 배열로 바꾸고 이를 하나씩 str에 담는다.
        for(char str : a.toCharArray()) {
            // 2. str의 값의 대소문자 판별
            //    소문자이면 true, 대문자이면 false 반환
            if(Character.isLowerCase(str)) {
                // 3. 소문자면 대문자로 변환
                answer += Character.toUpperCase(str);
            } else {
                //    대문자면 소문자로 변환
                answer += Character.toLowerCase(str);
            }
        }
        
        System.out.println(answer);
    }
}