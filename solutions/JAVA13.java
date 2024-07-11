class Solution {
    public long solution(long n){
        long answer = 0;
        
        if (Math.pow(Math.sqrt(n),2) == n){
            answer = Math.pow((Math.sqrt(n) + 1),2);
            return answer;
        }
        return -1;
    }
}