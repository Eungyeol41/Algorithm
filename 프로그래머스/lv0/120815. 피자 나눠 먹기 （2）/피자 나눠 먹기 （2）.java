class Solution {
    public int solution(int n) {
        int answer = 0;
        int pizza = 1;
		boolean result = false;

		while(!result) {
			int total = pizza * 6;
			if(total % n != 0) {
				pizza++;
			} else {
				result = true;
			}
		}
		answer = pizza;
        
        return answer;
    }
}