class Solution {
    public int solution(String[] babbling) {
        // 발음 가능한 패턴을 배열로 정의
        String[] patterns = {"aya", "ye", "woo", "ma"};
        
        int count = 0; // 발음 가능한 단어의 수를 셀 변수

        // 각 단어에 대해 발음 가능한지 검사
        for (String word : babbling) {
            String lastPattern = ""; // 이전 패턴 저장
            boolean isPronounceable = true; // 발음 가능 여부
            
            while (word.length() > 0) { // 단어가 완전히 지워질 때까지 반복
                boolean foundPattern = false; // 패턴 발견 여부
                
                // 패턴을 찾고 제거
                for (String pattern : patterns) {
                    if (word.startsWith(pattern) && !lastPattern.equals(pattern)) {
                        word = word.substring(pattern.length());
                        lastPattern = pattern;
                        foundPattern = true;
                        break;
                    }
                }
                
                // 패턴이 발견되지 않았다면 발음 불가능
                if (!foundPattern) {
                    isPronounceable = false;
                    break;
                }
            }
            
            // 단어가 완전히 지워졌다면 발음 가능
            if (isPronounceable && word.length() == 0) {
                count++;
            }
        }

        return count;
    }
}
