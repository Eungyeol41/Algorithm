class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        
        for(char str : control.toCharArray()) {
			if('w' == str) {
				n = n + 1;
			} else if('s' == str) {
				n = n - 1;
			} else if('d' == str) {
				n = n + 10;
			} else if('a' == str) {
				n = n - 10;
			}
			
            answer = n;
		}
        
        return answer;
    }
}