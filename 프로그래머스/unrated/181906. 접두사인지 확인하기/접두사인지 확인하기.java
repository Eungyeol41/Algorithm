class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        
        int len = my_string.length();
		int is_cnt = 0;
		for(int i = 1; i <= len; i++) {
			String str = my_string.substring(0, i);

			if(is_prefix.equals(str)) {
				is_cnt++;
			}

			answer = is_cnt > 0 ? 1 : 0;
		}
        
        return answer;
    }
}