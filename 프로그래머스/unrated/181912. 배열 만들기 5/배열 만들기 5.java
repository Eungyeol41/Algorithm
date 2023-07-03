import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        
        List<Integer> intList = new ArrayList<>();
		for (String str : intStrs) {
			int num = Integer.parseInt(str.substring(s, s+l));
			if(num > k) {
				intList.add(num);
			}
		}
		
		answer = new int[intList.size()];
		for (int i = 0; i < intList.size(); i++) {
			answer[i] = intList.get(i);
		}
        
        return answer;
    }
}