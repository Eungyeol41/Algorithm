class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];

		int numer = numer1 * denom2 + numer2 * denom1;
		int denom = denom1 * denom2;

		int length = Math.min(numer, denom);
		int max = 0;
		for (int i = 1; i <= length; i++) {
			if(numer % i == 0 && denom % i == 0) {
				max = Math.max(max, i);
			}
		}

		answer[0] = numer / max;
		answer[1] = denom / max;
        
        return answer;
    }
}