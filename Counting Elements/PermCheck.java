class Solution {
    public int solution(int[] A) {
        int[] numbers = new int[A.length + 1];
        int num = 0;
        int size = 0;
        for(int i = 0; i < A.length; i++) {
            num = A[i];
            if(num > A.length)
                return 0;
            if(numbers[num] == 0){
                numbers[num] = 1;
                size++;
            }
            else{
                return 0;
            }
        }
        return size == A.length ? 1 : 0;
    }
}