class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        Long pInt = Long.parseLong(p); //Long -> 숫자로 바꾸기
        for (int i=0; i<=t.length()-p.length(); i++){
            Long tss = Long.parseLong(t.substring(i, i+p.length()));
            if (pInt >= tss){
                answer ++;
            }
        }
        
        return answer;
    }
}

