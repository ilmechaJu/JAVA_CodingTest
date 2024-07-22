class Solution {
    public long solution(int price, long money, int count) {
        long answer = 0;
        for (int i=1; i<=count; i++){
            money -= price*i;
        }
        if (money <0){
            answer = -money;
        }
        else{
            answer = 0;
        }
        return answer;
    }
}

