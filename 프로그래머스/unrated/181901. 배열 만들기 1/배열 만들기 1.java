import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, int k) {
        List<Integer> mulList = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if(i % k == 0) {
				mulList.add(i);
			}
		}

		int[] answer = new int[mulList.size()];
		for (int i = 0 ; i < mulList.size() ; i++) {
			answer[i] = mulList.get(i).intValue();
		}
        
        return answer;
    }
}