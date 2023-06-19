class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        double sum = 0;

		int size = numbers.length;
		for(int number : numbers) {
			sum += number;
		}

		answer = sum / size;
        
        return answer;
    }
}