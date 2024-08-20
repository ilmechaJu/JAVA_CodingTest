import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String[] solution(String[] players, String[] callings) {
        // 선수 이름을 키, 선수의 현재 순위를 값으로 가지는 해시맵
        Map<String, Integer> playerRanks = new HashMap<>();

        // 초기 순위 설정
        for (int i = 0; i < players.length; i++) {
            playerRanks.put(players[i], i);
        }

        // callings 배열을 순회하면서 추월 시뮬레이션
        for (String calling : callings) {
            // 현재 추월한 선수의 순위
            int currentRank = playerRanks.get(calling);
            
            // 추월당한 선수는 현재 순위 - 1에 위치
            String overtakenPlayer = players[currentRank - 1];

            // 순위 변경
            players[currentRank] = overtakenPlayer;
            players[currentRank - 1] = calling;
            
            // 해시맵의 순위 정보 업데이트
            playerRanks.put(calling, currentRank - 1);
            playerRanks.put(overtakenPlayer, currentRank);
        }

        return players;
    }
}
