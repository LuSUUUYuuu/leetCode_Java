import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] nums = new int[5];

        nums[0] = 1;
        nums[1] = 3;
        nums[2] = 5;
        nums[3] = 7;
        nums[4] = 10;

        int target = 11;

        int[] ints = TwoSums.twoSum(nums, target);

        Arrays.asList(ints).forEach(System.out::println);
    }
}
