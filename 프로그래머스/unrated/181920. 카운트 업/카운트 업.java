class Solution {
    public int[] solution(int start, int end) {
        int count = end - start + 1;
		int[] answer = new int[count];

		int i = 0;
		while (start <= end) {
			answer[i] = start;

			start++;
			i++;
		}
        
        return answer;
    }
}