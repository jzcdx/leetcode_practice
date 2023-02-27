import java.util.HashMap;
import java.util.HashSet;

public class App {
    public static void main(String[] args) {
        /*
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        */
        System.out.println("hi");
        int temp[] = null;

        int nums[] = new int[]{1, 2, 3, 4, 5};
        int target = 3;
    }

    public static int[] twoSum(int[] nums, int target) {
        int res[] = new int[2];
        HashMap<Integer, Integer> visited = new HashMap<Integer, Integer>();
        //visited.put(3, 5);
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
        
    }
}
