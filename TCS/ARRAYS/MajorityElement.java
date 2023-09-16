package TCS.ARRAYS;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        MajorityElement majorityElementFinder = new MajorityElement();
        int result = majorityElementFinder.majorityElement(nums);
        System.out.println(result);
    }
}
