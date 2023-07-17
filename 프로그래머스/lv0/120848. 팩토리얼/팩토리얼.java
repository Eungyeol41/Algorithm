class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int i = 1;
		while (i < n) {
			int first = factorial(i);
			int second = factorial(i + 1);

			if(first <= n && n < second) {
				break;
            }

			i++;
		}
        
        answer = i;
        
        return answer;
    }
    
    private static int factorial(int n) {
		int result = 1;

		for(int i = 1; i <= n; i++) {
			result *= i;
		}

		return result;
	}
}