class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int cnt = 0;
        for (int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){
                for (int k=j+1; k<nums.length; k++){
                    answer = nums[i]+nums[j]+nums[k];
                    if (isPrime(answer)){
                        cnt+=1;
                    }
                    
                }
            }
        }
        return cnt;
    }
    
    private boolean isPrime(int num){
        if (num ==1) return false;
        else if (num==2) return true;
        else{
            for(int i=2; i<=Math.sqrt(num); i++){
                if (num % i==0){
                    return false;  
                } 
                
            }
            
        }
        return true;
    }
}