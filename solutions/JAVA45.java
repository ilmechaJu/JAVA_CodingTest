import java.util.*;

class Solution {
    public String solution(int[] food) {
        StringBuilder left = new StringBuilder();
        
        // food 배열을 순회하면서 문자열을 생성
        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2; // 해당 음식의 절반 개수 계산
            for (int j = 0; j < count; j++) {
                left.append(i); // 숫자를 문자열로 추가
            }
        }
        
        StringBuilder right = new StringBuilder(left).reverse(); // left의 반대 문자열 생성

        return left.toString() + "0" + right.toString(); // 최종 결과 문자열 반환
    }
}






