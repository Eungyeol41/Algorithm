import java.util.ArrayList;

class Solution {
    public String solution(int age) {
        String answer = "";
        
        ArrayList<Integer> arrNum = new ArrayList<>();
		while (age > 0) {
			arrNum.add(age % 10);
			age /= 10;
		}

		for (int i = arrNum.size() - 1; i >= 0; i--) {
			answer += chgNum(arrNum.get(i));
		}
        
        return answer;
    }
    
    private static String chgNum(int age) {
		String chngRe = "";

		if(age == 0) {
			chngRe = "a";
		} else if(age == 1) {
			chngRe = "b";
		} else if(age == 2) {
			chngRe = "c";
		} else if(age == 3) {
			chngRe = "d";
		} else if(age == 4) {
			chngRe = "e";
		} else if(age == 5) {
			chngRe = "f";
		} else if(age == 6) {
			chngRe = "g";
		} else if(age == 7) {
			chngRe = "h";
		} else if(age == 8) {
			chngRe = "i";
		} else if(age == 9) {
			chngRe = "j";
		}

		return chngRe;
	}
}