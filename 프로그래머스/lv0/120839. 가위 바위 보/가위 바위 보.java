class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        for (char rsp_char : rsp.toCharArray()) {
			if(rsp_char == '2') {
				answer += '0';
			} else if(rsp_char == '0') {
				answer += '5';
			} else if(rsp_char == '5') {
				answer += '2';
			}
		}
        
        return answer;
    }
}