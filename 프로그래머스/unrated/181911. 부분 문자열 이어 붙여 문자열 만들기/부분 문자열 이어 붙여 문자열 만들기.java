class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        
        int i = 0;
		for(String str : my_strings) {
			int firstIndex = parts[i][0];
			int secondIndex = parts[i][1];

			answer += str.substring(firstIndex, secondIndex + 1);

			i++;
		}
        
        return answer;
    }
}