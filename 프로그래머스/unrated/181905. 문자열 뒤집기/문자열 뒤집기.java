class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        
        answer += my_string.substring(0, s);

		String subStr = my_string.substring(s, e + 1);

		for(int i = subStr.length() - 1; i >= 0; i--) {
			answer += subStr.toCharArray()[i];
		}

		answer += my_string.substring(e + 1);
        
        return answer;
    }
}