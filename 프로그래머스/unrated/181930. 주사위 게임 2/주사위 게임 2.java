class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        
        int eqCnt = 0;

		if(a == b) eqCnt++;
		if(a == c) eqCnt++;
		if(b == c) eqCnt++;

		if(eqCnt == 0) {
			answer = a + b + c;
		} else if(eqCnt == 3) {
			int sum1 = a + b + c;
			int sum2 = (int) (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
			int sum3 = (int) (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));

			answer = sum1 * sum2 * sum3;
		} else {
			int sum1 = a + b + c;
			int sum2 = (int) (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));

			answer = sum1 * sum2;
		}
        
        return answer;
    }
}