class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        
        for (char str : my_string.toCharArray()) {
			String str1 = Character.toString(str);
            
			if(!letter.equals(str1)) {
				answer += str1;
			}
		}
        
        return answer;
    }
}