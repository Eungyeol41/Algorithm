import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        List<Integer> pairList = new ArrayList<>();
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				pairList.add(i);
			}
		}

		answer = pairList.size();
        
        return answer;
    }
}