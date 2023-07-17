import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        int num_len = numbers.length;
		Arrays.sort(numbers);
		answer = numbers[num_len - 1] * numbers[num_len - 2];
        
        return answer;
    }
}