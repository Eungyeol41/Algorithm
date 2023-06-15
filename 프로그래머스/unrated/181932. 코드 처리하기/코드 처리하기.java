class Solution {
    public String solution(String code) {
        String answer = "";
        int i = 0;
        int mode = 0;
        
		for(char str : code.toCharArray()) {
			if(mode == 1) {
				if('1' == str) {
					mode = 0;
				} else {
					if(i % 2 == 1) answer += str;
				}
			} else {
				if('1' == str) {
					mode = 1;
				} else {
					if(i % 2 == 0) answer += str;
				}
			}

			i++;
		}
        
        if("".equals(answer)) {
			answer = "EMPTY";
		}
        
        return answer;
    }
}