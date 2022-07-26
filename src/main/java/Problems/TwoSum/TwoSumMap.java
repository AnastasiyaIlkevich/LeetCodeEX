package Problems.TwoSum;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumMap {

    public static void main(String[] args) {
        int[] answer = new int[2];
        int[] nums = {2,7,11,15};
        int target = 9;
        int res = 0;
        int count = 0;
        HashMap<Integer, Integer> mapInt = new HashMap<>();
        for (Integer i : nums) {
            mapInt.put(i, count);
            count++;
        }


        System.out.println(mapInt);

        for (int i = 0; i < nums.length; i++) {
            res = target - nums[i];
            if (mapInt.containsKey(res)&& mapInt.get(res)!=i) {
                answer[0] = i;
                break;
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == res) {
                answer[1] = i;
                break;
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}
