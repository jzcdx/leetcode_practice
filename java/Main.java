import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("hi globe");
    }

    public static int[] twoSum(int[] nums, int target) {
        int res[] = new int[2];
        HashMap<Integer, Integer> visited = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int curNum = nums[i];
            int compliment = target - curNum;
            if (visited.containsKey(compliment)) {
                res = new int[]{visited.get(compliment), i};
            } else {
                visited.put(nums[i], i);
            }
        }
        return res;
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> uniques = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (uniques.contains(nums[i])) {
                return true;
            } else {
                uniques.add(nums[i]);
            }
        }
        return false;
    }

    public static boolean validAnagram(String s, String t) {
        return false;
    }
}
