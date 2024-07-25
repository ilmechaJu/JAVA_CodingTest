class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int ck_num = 0;
        for (int i=0; i<number.length; i++){
            for (int j=i+1; j<number.length; j++){
                for (int k=j+1; k<number.length; k++){
                    ck_num = number[i]+number[j]+number[k];
                    if (ck_num ==0){
                        answer +=1;
                    }
                }   
            }      
        }
        return answer;
    }
}