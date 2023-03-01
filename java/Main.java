import java.util.HashMap;
import java.util.HashSet;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("hi globe");
        
        String s = "asdf";
        String t = "asgd";
        validAnagram(s, t);
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
        HashMap<Character, Integer> sfreqs = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char cur_char = s.charAt(i);
            if (sfreqs.containsKey(cur_char)) {
                sfreqs.put(cur_char, sfreqs.get(cur_char) + 1);
            } else {
                sfreqs.put(cur_char, 1);
            }
        }

        HashMap<Character, Integer> tfreqs = new HashMap<Character, Integer>();
        for (int i = 0; i < t.length(); i++) {
            char cur_char = t.charAt(i);
            if (tfreqs.containsKey(cur_char)) {
                tfreqs.put(cur_char, tfreqs.get(cur_char) + 1);
            } else {
                tfreqs.put(cur_char, 1);
            }
        }
        return tfreqs.equals(sfreqs);
    }

    public static int search(int[] nums, int target) { //binary search
        int l = 0;
        int r = nums.length - 1;
        int cur[] = nums;
        int mid;
        while (l <= r) {
            mid = (l + r) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }   
        return -1;
    }
}
