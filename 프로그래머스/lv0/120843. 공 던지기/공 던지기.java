import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        
        List<Integer> num_list = new ArrayList<>();
		int num = 1; // 던지는 사람 번호
		int cnt = 0; // x번재
		boolean result = true;
        
        num_list.add(num);
		while (result) {
			num += 2;

			// num이 numbers의 마지막 값보다 클 때
			if (num > numbers[numbers.length - 1]) {
				num -= numbers[numbers.length - 1];
			}

			num_list.add(num);
			cnt++;

			if (cnt > k) {
				result = false;
			}
		}

		answer = num_list.get(k - 1);
        
        return answer;
    }
}