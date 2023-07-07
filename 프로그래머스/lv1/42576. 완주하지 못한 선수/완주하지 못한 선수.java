import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> map = new HashMap<>();

		// 참가자 배열을 해시맵에 이름을 키로 저장하고, 값은 등장 횟수로 기록
		for (String name : participant) {
			if (map.containsKey(name)) {
				map.put(name, map.get(name) + 1);
			} else {
				map.put(name, 1);
			}
		}

		// 완주한 선수들의 이름을 해시맵에서 제거
		for (String name : completion) {
			if (map.containsKey(name)) {
				map.put(name, map.get(name) - 1);
				if (map.get(name) == 0) {
					map.remove(name);
				}
			}
		}

		// 완주하지 못한 선수 : 해시맵에 남아있는 이름
		for (String name : map.keySet()) {
			answer = name;
		}
        
        return answer;
    }
}