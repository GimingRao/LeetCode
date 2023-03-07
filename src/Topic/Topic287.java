package Topic;

public class Topic287 {
    public static int findDuplicate(int[] nums) {
        int n = nums.length;
        int left = 1, right = n - 1;  // 数字范围 [1, n]
        while (left < right) {
            int mid = left + (right - left) / 2;
            int cnt = 0;
            for (int num : nums) {
                if (num <= mid) cnt++;
            }
            if (cnt > mid) {  // 左边有重复数字
                right = mid;
            } else {  // 右边有重复数字
                left = mid + 1;
            }
        }
        return left;  // 返回任意一个重复数字
    }

    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[]{1, 3, 4, 2, 2}));
    }
}
