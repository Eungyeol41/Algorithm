class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        int[] answer = new int[len + 1];

		int last_num = num_list[len - 1];
		int last_num_1 = num_list[len - 2];

		for(int i = 0; i < len; i++) {
			answer[i] = num_list[i];
		}

		answer[len] = last_num > last_num_1 ? last_num - last_num_1 : last_num * 2;
        
        return answer;
    }
}