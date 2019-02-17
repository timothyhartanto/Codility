class Solution {
    public int solution(int[] A) {
        int counter = 0;
        int pair = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] == 0){
                counter++;
            }
            if(A[i] == 1) {
                pair += counter;
            }
        }
        return Math.abs(pair) > 1000000000 ? -1 : pair; 
    }
}