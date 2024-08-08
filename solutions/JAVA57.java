class Solution {
    public String solution(String X, String Y) {
        // 각 숫자(0~9)의 출현 빈도를 저장하는 배열
        int[] countX = new int[10];
        int[] countY = new int[10];
        
        // X의 각 숫자의 빈도를 카운트
        for (char c : X.toCharArray()) {
            countX[c - '0']++;
        }
        
        // Y의 각 숫자의 빈도를 카운트
        for (char c : Y.toCharArray()) {
            countY[c - '0']++;
        }
        
        // 공통으로 나타나는 숫자를 저장하기 위한 StringBuilder
        StringBuilder result = new StringBuilder();
        
        // 9부터 0까지 공통 숫자 만들기
        for (int i = 9; i >= 0; i--) {
            int count = Math.min(countX[i], countY[i]); // 최소 공통 빈도 찾기
            for (int j = 0; j < count; j++) {
                result.append(i);
            }
        }
        
        // 결과 확인
        if (result.length() == 0) { // 공통 숫자가 없는 경우
            return "-1";
        }
        
        // 결과가 0으로만 구성된 경우
        if (result.charAt(0) == '0') {
            return "0";
        }
        
        // 문자열로 변환하여 반환
        return result.toString();
    }
}
