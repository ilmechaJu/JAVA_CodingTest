class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double tot = 0;
        
        for(int i : arr){
            tot += i;
        }
        answer = tot/arr.length;
        return answer;
    }

}

