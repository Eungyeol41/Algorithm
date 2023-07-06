class Solution {
    public int solution(int balls, int share) {
        int answer = 0;
        
        answer = combination(balls, share);
        
        return answer;
    }
    
    public static int combination(int n, int r) {
		if (r == 0 || n == r) {
			return 1;
		} else {
			return combination(n - 1, r - 1) + combination(n - 1, r);
		}
	}
}