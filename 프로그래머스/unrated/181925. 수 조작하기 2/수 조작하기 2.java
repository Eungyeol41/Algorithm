class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        
        for(int i = 0; i < numLog.length - 1; i++) {

			int min = min = numLog[i + 1] - numLog[i];

			if(1 == min) {
				answer += "w";
			} else if(-1 == min) {
				answer += "s";
			} else if(10 == min) {
				answer += "d";
			} else if(-10 == min) {
				answer += "a";
			}
		}
        
        return answer;
    }
}