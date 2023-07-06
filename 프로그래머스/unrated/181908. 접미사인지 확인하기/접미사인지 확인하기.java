class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        
        int is_cnt = 0;
		int len = my_string.length();
		for(int i = 1; i <= len; i++) {
			String str = my_string.substring(len - i, len);

			if(is_suffix.equals(str)) {
				is_cnt++;
			}
		}

		answer = is_cnt > 0 ? 1 : 0;
        
        return answer;
    }
}