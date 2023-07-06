import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {        
        int len = my_string.length();
		String[] answer = new String[len];
		
		int j = 0;
		for(int i = 1; i <= len; i++) {
			answer[j] = my_string.substring(len - i, len);

			j++;
		}

		Arrays.sort(answer);
        
        return answer;
    }
}