import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuffer sb = new StringBuffer();
        sb.append(Integer.toString(n,3)); //3진법 변환법(10진수 외에는 다 문자열임)
        sb = sb.reverse();
        
        answer = Integer.parseInt(sb.toString(), 3); //3진수를 10진수로 변환
        
        return answer;
    }
}

