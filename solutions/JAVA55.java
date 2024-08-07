import java.util.Arrays;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        // 각 순위에 해당하는 당첨 개수
        int[] rank = {6, 6, 5, 4, 3, 2, 1}; 

        // 0의 개수와 맞춘 번호의 개수를 초기화
        int zeroCount = 0;
        int matchCount = 0;

        // 로또 번호 배열을 탐색
        for (int lotto : lottos) {
            if (lotto == 0) {
                zeroCount++; // 0인 경우
            } else if (contains(win_nums, lotto)) {
                matchCount++; // 당첨 번호와 일치하는 경우
            }
        }

        // 최고 순위: 맞춘 번호 + 0의 개수
        int maxRank = rank[matchCount + zeroCount];
        // 최저 순위: 현재 맞춘 번호
        int minRank = rank[matchCount];

        return new int[]{maxRank, minRank}; // 결과 반환
    }

    // 특정 번호가 배열에 포함되어 있는지 확인하는 함수
    private boolean contains(int[] arr, int num) {
        for (int n : arr) {
            if (n == num) {
                return true;
            }
        }
        return false;
    }
}
