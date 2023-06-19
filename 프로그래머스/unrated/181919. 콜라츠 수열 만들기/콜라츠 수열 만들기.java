import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(n);

		while (n != 1) {
			if(n % 2 == 0) {
				n /= 2;
			} else {
				n = 3 * n + 1;
			}

			arrayList.add(n);
		}

		int arrSize = arrayList.size();
		int[] answer = new int[arrSize];
		for (int i = 0; i < arrSize; i++) {
			answer[i] = arrayList.get(i);
		}
        
        return answer;
    }
}