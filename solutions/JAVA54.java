import java.util.ArrayList;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        // 1부터 number까지 각 숫자의 약수 개수를 arr에 추가
        for (int i = 1; i <= number; i++) {
            arr.add(countDivisors(i)); // 약수 개수 추가
        }
        
        // 약수 개수를 기반으로 무기 공격력을 계산
        for (int i = 0; i < arr.size(); i++) {  // 배열 접근을 ArrayList에 맞게 수정
            int attackPower = arr.get(i);  // ArrayList 요소 접근
            if (attackPower > limit) {
                attackPower = power;  // 제한 수치를 초과하면 지정 공격력 사용
            }
            answer += attackPower;  // 총 공격력에 추가
        }
        
        return answer;
    }
    
    // 약수 개수를 계산하는 메소드
    private int countDivisors(int n) {  // 반환 타입 int 지정
        int cnt = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {  // 약수 확인
                cnt += 1;  // 약수 개수 증가
                if (i!=n/i){
                    cnt++;
                }
            }
        }
        return cnt;     
    }
}
