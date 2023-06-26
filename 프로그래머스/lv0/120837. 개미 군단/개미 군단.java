class Solution {
    public int solution(int hp) {
        int answer = 0;
        int[] pwList = {5, 3, 1};

		for(int pw : pwList) {
			if(hp / pw > 0) {
				answer += hp / pw;
				hp %= pw;
			}
		}
        
        return answer;
    }
}