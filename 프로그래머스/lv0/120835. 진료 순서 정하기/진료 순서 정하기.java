class Solution {
    public int[] solution(int[] emergency) {
        int length = emergency.length;
		int[] answer = new int[length];
		for (int i = 0; i < emergency.length; i++) {
			int count = 1;
			for (int j = 0; j < emergency.length; j++) {
				if (emergency[i] < emergency[j]) {
					count++;
				}
			}
			answer[i] = count;
		}
        
        return answer;
    }
}