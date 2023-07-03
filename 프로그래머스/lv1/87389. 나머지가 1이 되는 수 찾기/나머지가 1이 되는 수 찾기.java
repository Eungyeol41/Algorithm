class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = n; i >= 1; i--) {
			if(n %i == 1) {
				answer = answer == 0 ? i : Math.min(answer, i);
			}
		}
        
        return answer;
    }
}