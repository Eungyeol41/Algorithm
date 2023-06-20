class Solution {
    public int solution(String number) {
        int answer = 0;
        int sum = 0;
        
		for(char num : number.toCharArray()) {
			int cInt = (int) num - 48;

			sum += cInt;
		}

		answer = sum % 9;
        
        return answer;
    }
}