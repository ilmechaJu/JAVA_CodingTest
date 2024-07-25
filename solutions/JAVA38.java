class Solution {
    public int solution(int[][] sizes) {
        int w = -2147000000;
        int h = -2147000000;
        int max_w = 0;
        int max_h = 0;
        
        for (int i=0; i<sizes.length; i++){
            w = Math.max(sizes[i][0], sizes[i][1]);
            h = Math.min(sizes[i][1], sizes[i][0]);
            max_w = Math.max(max_w, w);
            max_h = Math.max(max_h, h);
        }
        
        return max_w*max_h;
    }
}