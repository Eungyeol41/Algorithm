class Solution {
    public int[][] solution(int[] num_list, int n) {
        int an_len = num_list.length / n;
		int[][] answer = new int[an_len][n];

		int j = 0;
		for (int i = 0; i < an_len; i++) {
			if (j > num_list.length) {
				break;
			}

			for (int l = 0; l < n; l++) {
				answer[i][l] = num_list[j];
				j++;
			}
		}
        
        return answer;
    }
}