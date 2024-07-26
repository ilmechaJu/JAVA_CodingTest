class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            //공백일 경우
            if (ch == ' ') {
                answer += ch;
                continue;
            }
            
            
            if (ch >= 'a' && ch <= 'z') {
                answer += (char) ((ch - 'a' + n) % 26 + 'a');
            } else { 
                answer += (char) ((ch - 'A' + n) % 26 + 'A');
            }
            
        }
        return answer;
    }
}