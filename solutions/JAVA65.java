import java.util.*;

public class Solution {
    
    // "YYYY.MM.DD" 형식의 날짜를 총 일수로 변환하는 함수
    public int convertToDate(String date) {
        String[] parts = date.split("\\.");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        
        // 연도, 월, 일을 기준으로 총 일수 계산 (모든 달은 28일로 가정)
        return (year * 12 * 28) + (month * 28) + day;
    }
    
    public List<Integer> solution(String today, String[] terms, String[] privacies) {
        Map<String, Integer> termMap = new HashMap<>();
        
        // 약관 종류와 유효기간(월 단위)을 매핑
        for (String term : terms) {
            String[] parts = term.split(" ");
            String type = parts[0];
            int duration = Integer.parseInt(parts[1]);
            termMap.put(type, duration);
        }
        
        int todayDate = convertToDate(today);  // 오늘 날짜를 일수로 변환
        List<Integer> result = new ArrayList<>();
        
        // 개인정보 유효기간 확인
        for (int i = 0; i < privacies.length; i++) {
            String[] parts = privacies[i].split(" ");
            String collectedDate = parts[0];
            String type = parts[1];
            
            int collectedDateDays = convertToDate(collectedDate);  // 개인정보 수집 날짜를 일수로 변환
            int duration = termMap.get(type) * 28;  // 유효기간을 일수로 변환
            int expiryDate = collectedDateDays + duration;  // 만료 날짜 계산
            
            // 만료일이 오늘 날짜와 같거나 이전이면 파기 대상
            if (expiryDate <= todayDate) {
                result.add(i + 1);
            }
        }
        
        return result;
    }
}
