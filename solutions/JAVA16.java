class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int x = Math.min(a,b);
        int x2 = Math.max(a,b);
        
        if (x==x2){
            answer = x;
        }
        else{
            for(long i=x; i<=x2; i++){
                answer += i;
            }    
        }
        
        return answer;
    }
}