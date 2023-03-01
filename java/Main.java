import java.util.HashMap;
import java.util.HashSet;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        isPalindrome("123asdfb: asd#f d");
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

    public static boolean isPalindrome(String s) {
        if (s.length() == 0 | s.length() == 1) {
            return true;
        }
        s = s.replaceAll("[^A-Za-z0-9]", ""); //gets rid of all the non alphanumeric stuff. (spaces, extra symbols, etc)

        int l, r;
        if (s.length() % 2 == 1) {
            int mid = (s.length() - 1) / 2;
            l = mid - 1;
            r = mid + 1;
        } else {
            l = (s.length() / 2) - 1;
            r = s.length() / 2;
        }

        while (l >= 0 && r <= s.length() - 1) {
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            l--;
            r++;
        }
        return true;
    }
}
