import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int lastPainted = 0; // 마지막으로 페인트가 칠해진 위치를 추적

        for (int i = 0; i < section.length; i++) {
            // 현재 구역이 마지막으로 칠해진 위치보다 큰 경우 롤러를 사용해야 함
            if (section[i] > lastPainted) {
                answer++;  // 롤러 사용 횟수 증가
                lastPainted = section[i] + m - 1;  // 롤러로 칠할 수 있는 마지막 위치 설정
            }
        }

        return answer;  // 최소 롤러 사용 횟수 반환
    }
}
