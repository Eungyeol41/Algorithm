import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        int maxArr = -1;
		for (int arr : array) {
			maxArr = Math.max(maxArr, arr);
		}
        
        // array 배열의 길이가 1일 때 해당 값 바로 출력
        if(array.length == 1) {
			answer = array[0];

			return answer;
		}

		Arrays.sort(array);

		int[] mode = new int[maxArr + 1];
		for (int i = 0; i < array.length; i++) {
			mode[array[i]]++;
		}
		
		int max = -1;
		// mode 배열의 최댓값 구하기
		for (int num : mode) {
			max = Math.max(max, num);
		}

		int eqCnt = 0;
		int mIndex = 0;
		for(int i = 0; i < mode.length; i++) {
			if(max == mode[i]) {
				eqCnt++;
				mIndex = i;
			}
		}
		
		if(eqCnt > 1) {
			answer = -1;
		} else {
			answer = mIndex;
		}
        
        return answer;
    }
}