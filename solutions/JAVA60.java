import java.util.*;

public class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        // 문자에 대한 최소 클릭 수를 저장할 맵
        Map<Character, Integer> minKeyPressMap = new HashMap<>();

        // 각 키맵에서 문자의 최소 클릭 수를 계산
        for (int i = 0; i < keymap.length; i++) {
            String key = keymap[i];
            for (int j = 0; j < key.length(); j++) {
                char ch = key.charAt(j);
                int pressCount = j + 1; // 인덱스 + 1 = 클릭 횟수
                if (!minKeyPressMap.containsKey(ch)) {
                    minKeyPressMap.put(ch, pressCount);
                } else {
                    // 최소 클릭 수 업데이트
                    minKeyPressMap.put(ch, Math.min(minKeyPressMap.get(ch), pressCount));
                }
            }
        }

        int[] result = new int[targets.length];

        // 각 타겟 문자열에 대해 최소 클릭 수를 계산
        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            int totalPressCount = 0;

            for (int j = 0; j < target.length(); j++) {
                char ch = target.charAt(j);
                if (minKeyPressMap.containsKey(ch)) {
                    totalPressCount += minKeyPressMap.get(ch);
                } else {
                    totalPressCount = -1; // 문자가 존재하지 않음
                    break;
                }
            }

            result[i] = totalPressCount;
        }

        return result;
    }
}