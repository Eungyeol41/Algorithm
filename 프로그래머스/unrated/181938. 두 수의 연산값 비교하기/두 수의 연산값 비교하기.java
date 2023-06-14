class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int sum1 = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
		int sum2 = 2 * a * b;

		answer = Math.max(sum1, sum2);
        
        return answer;
    }
}