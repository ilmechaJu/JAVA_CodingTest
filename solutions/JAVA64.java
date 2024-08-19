public class Solution {
    public int[] solution(String[] wallpaper) {
        // 초기값 설정: lux, luy는 최대값으로, rdx, rdy는 최소값으로 설정
        int lux = Integer.MAX_VALUE;
        int luy = Integer.MAX_VALUE;
        int rdx = Integer.MIN_VALUE;
        int rdy = Integer.MIN_VALUE;
        
        // wallpaper 배열을 순회하면서 파일의 위치를 찾습니다.
        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    // 최소값과 최대값을 업데이트 합니다.
                    lux = Math.min(lux, i);
                    luy = Math.min(luy, j);
                    rdx = Math.max(rdx, i + 1);
                    rdy = Math.max(rdy, j + 1);
                }
            }
        }
        
        // 결과 배열을 반환합니다.
        return new int[] {lux, luy, rdx, rdy};
    }
}
