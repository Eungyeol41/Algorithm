class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        
        String str1 = x1 ? "T" : "F";
		String str2 = x2 ? "T" : "F";
		String str3 = x3 ? "T" : "F";
		String str4 = x4 ? "T" : "F";

		String result = fncBoolean2(fncBoolean1(str1, str2), fncBoolean1(str3, str4));
		answer = "T".equals(result);
        
        return answer;
    }
    
    private static String fncBoolean1(String str1, String str2) {
		String xy1 = "";

		if("T".equals(str1) && "T".equals(str2)) {
			xy1 = "T";
		} else if("T".equals(str1) && "F".equals(str2)) {
			xy1 = "T";
		} else if("F".equals(str1) && "T".equals(str2)) {
			xy1 = "T";
		} else if("F".equals(str1) && "F".equals(str2)) {
			xy1 = "F";
		}

		return xy1;
	}

	private static String fncBoolean2(String str1, String str2) {
		String xy2 = "";

		if("T".equals(str1) && "T".equals(str2)) {
			xy2 = "T";
		} else if("T".equals(str1) && "F".equals(str2)) {
			xy2 = "F";
		} else if("F".equals(str1) && "T".equals(str2)) {
			xy2 = "F";
		} else if("F".equals(str1) && "F".equals(str2)) {
			xy2 = "F";
		}

		return xy2;
	}
}