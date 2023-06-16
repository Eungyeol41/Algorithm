import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        int num = n % 2 == 0 ? n / 2 : n / 2 + 1;
		int[] answer = new int[num];

		ArrayList<Integer> arrList = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			if(i % 2 == 1) {
				arrList.add(i);
			}
		}

		for(int i = 0; i < num; i++) {
			answer[i] = arrList.get(i);
		}
        
        return answer;
    }
}