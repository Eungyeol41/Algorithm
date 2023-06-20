class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        
        int length = my_string.toCharArray().length;
		char[] my_list = my_string.toCharArray();
		for(int index : index_list) {
			answer += my_list[index];
		}
        
        return answer;
    }
}