import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = Arrays.copyOf(arr, arr.length);

		for(int[] query : queries) {
			int temp = 0;

			temp = answer[query[0]];
			answer[query[0]] = answer[query[1]];
			answer[query[1]] = temp;
		}
        
        return answer;
    }
}