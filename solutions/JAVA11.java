class Solution {
    public int[] solution(long n) {
        String s =""+n; //int n을 str로 만들기
        int[] answer = new int[s.length()]; 
        int cnt = 0;
        while(n>0){
            answer[cnt] = (int)(n%10);
            n/=10;
            cnt++;
        }
        return answer;
    }
}

