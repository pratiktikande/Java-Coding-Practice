package Interview_Prep;

public class FindMinimumInRotatedSortedArray {

    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                // Minimum element must be in the right half
                left = mid + 1;
            } else if (nums[mid] < nums[right]) {
                // Minimum element must be in the left half (including mid)
                right = mid;
            } else {
                // Duplicate elements are present, reduce the search space
                right--;
            }
        }

        return nums[left];
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
        int[] nums2 = {3, 4, 5, 1, 2};
        int[] nums3 = {2, 2, 2, 0, 1};
        
        System.out.println("Minimum element in nums1: " + findMin(nums1));
        System.out.println("Minimum element in nums2: " + findMin(nums2));
        System.out.println("Minimum element in nums3: " + findMin(nums3));
    }
}


//www.github.com/pratiktikande
//@Pratik Tikande