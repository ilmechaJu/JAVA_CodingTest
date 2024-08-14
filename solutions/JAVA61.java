public class Solution {
    public static String solution(String s, String skip, int index) {
        StringBuilder result = new StringBuilder();
        
        // 알파벳을 순환하기 위해 기본 알파벳 배열을 정의
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        
        // skip에 포함된 문자들을 제거한 유효한 알파벳만으로 이루어진 문자열 생성
        for (char ch : skip.toCharArray()) {
            alphabet = alphabet.replace(String.valueOf(ch), "");
        }
        
        // s의 각 문자를 처리
        for (char ch : s.toCharArray()) {
            int currentIndex = alphabet.indexOf(ch);  // 현재 문자의 위치
            int newIndex = (currentIndex + index) % alphabet.length();  // index만큼 뒤로 이동한 위치
            result.append(alphabet.charAt(newIndex));  // 결과에 해당 문자 추가
        }
        
        return result.toString();
    }
}