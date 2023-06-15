class Solution {
    public int[] solution(int[] numbers) {
        int nLeng = numbers.length;
		int[] answer = new int[nLeng];

		for (int i = 0; i < nLeng; i++) {
			answer[i] = numbers[i] * 2;
		}
        
        return answer;
    }
}