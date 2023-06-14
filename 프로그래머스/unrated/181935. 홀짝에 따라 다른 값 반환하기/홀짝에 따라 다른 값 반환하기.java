class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if(n % 2 == 0) { // 짝수
			for(int i = 1; i < n+1; i++) {
				if(i % 2 == 0) {
					answer += Math.pow(i, 2);
				}
			}
		} else { // 홀수
			for(int i = 1; i < n+1; i++) {
				if(i % 2 != 0) {
					answer += i;
				}
			}
		}
        
        return answer;
    }
}