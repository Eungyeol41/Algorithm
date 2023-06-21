class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        
        for (int i = 0; i < queries.length; i++) {
			String str1 = my_string.substring(0, queries[i][0]);
			int first = queries[i][0];
			int second = queries[i][1];
			String str2 = "";

			for(int j = second; j >= first; j--) {
				str2 += my_string.substring(j, j + 1);
			}
			String str3 = my_string.substring(queries[i][1] + 1);

			my_string = str1 + str2 + str3;
		}

		answer = my_string;
        
        return answer;
    }
}