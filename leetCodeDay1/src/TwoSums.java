import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TwoSums {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            System.out.println("i----->" + i);
            System.out.println("nums[" + i + "]----->" + nums[i]);
            System.out.println("target - nums[i]---->" + (target - nums[i]));
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }

    public static int[] twoSum0(int[] nums, int target){
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (hashtable.containsKey(target - num)){
                return new int[]{hashtable.get(target - num), i};
            }
            hashtable.put(num, i);

        }
        return new int[0];
    }
}

