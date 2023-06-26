import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = setList(l, r);
        return answer;
    }
    
    public static int[] setList(int l, int r) {
		ArrayList<Integer> result = new ArrayList<>();

		for (int i = l; i <= r; i++) {
			if (containsOnly05(i)) {
				result.add(i);
			}
		}

		if (result.isEmpty()) {
			result.add(-1);
		}

		Collections.sort(result);

		int[] arr = new int[result.size()];
		for (int i = 0; i < result.size(); i++) {
			arr[i] = result.get(i);
		}

		return arr;
	}

	private static boolean containsOnly05(int num) {
		String strNum = String.valueOf(num);
		for (char c : strNum.toCharArray()) {
			if (c != '0' && c != '5') {
				return false;
			}

		}
		return true;
	}
}