import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        List<Integer> divList = new ArrayList<>(); // 합성수 모음
		int j = 1;
		while (j <= n) {
			List<Integer> numList = new ArrayList<>(); // j에 대한 약수 모음
			for (int i = 1; i <= j; i++) {
				if (j % i == 0) {
					numList.add(i);
				}
			}

			if(numList.size() >= 3) { // j의 약수의 개수가 3 이상일 때 :: 합성수
				divList.add(j);
			}

			j++;
		}

		answer = divList.size();
        
        return answer;
    }
}