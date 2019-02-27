import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] A) {
        Integer[] numbers = Arrays.stream(A).boxed().toArray(Integer[]::new);
        List<Integer> nums = Arrays.asList(numbers);
        Set<Integer> uniqueNumbers = new HashSet<>();
        uniqueNumbers.addAll(nums);
        return uniqueNumbers.size();
    }
}