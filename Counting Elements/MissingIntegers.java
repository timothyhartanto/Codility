//Given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
//
//For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
//
//Given A = [1, 2, 3], the function should return 4.
//
//Given A = [−1, −3], the function should return 1.
//
//Write an efficient algorithm for the following assumptions:
//
//N is an integer within the range [1..100,000];
//each element of array A is an integer within the range [−1,000,000..1,000,000].

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int[] numbers = new int[1000001];
        int value = 0;
        for(int i = 0; i < A.length; i++) {
            value = A[i];
            if(value > 0 && numbers[value] == 0) {
                numbers[value] = 1;
            }
        }
        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] == 0)
                return i;
        }
        return 1;
    }
}