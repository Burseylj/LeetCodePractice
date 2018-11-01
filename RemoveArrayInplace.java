import java.util.ArrayList;
import java.util.Arrays;

public class CodeSnippets {
	/*Given an array nums and a value val, remove all instances of that value in-place and return the new length.

	Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

	The order of elements can be changed. It doesn't matter what you leave beyond the new length
*/   
	public static int removeElement(int[] nums, int val) {
		//pointer for our position in the new val free array
        int iUnique = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val){
                nums[iUnique] = nums[i];
                iUnique++;
            }
        }
        return iUnique;
	}
	/*Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
	*/
	public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int prev = nums[0];
        //pointer for our position in the new unique ints array
        int iUnique = 1;
        for (int i = 1; i < nums.length; i++){
            if (nums[i] != prev){
                nums[iUnique] = nums[i];
                prev = nums[i];
                iUnique++;
            }
        }
        return iUnique;
    }


	public static void main(String[] args) {
		//create test cases
		ArrayList<int[]> numArrs = new ArrayList<int[]>();
		int[] nums1 = {1,2,3};
		numArrs.add(nums1);
		int[] nums2 = {1,1,2,2,3,3,3,3,4};
		numArrs.add(nums2);
		int[] nums3 = {};
		numArrs.add(nums3);
		int[] nums4 = {90,90,90};
		numArrs.add(nums4);
		int[] nums5 = {-1,10,10,100};
		numArrs.add(nums5);
		//duplicate test cases for remove element's testing
		ArrayList<int[]> numArrs1 = new ArrayList<int[]>(numArrs);
		System.out.println("Remove Unique:\n");
		for (int[] numArr : numArrs){
			System.out.print(Arrays.toString(numArr) + " --> ");
			int len = removeDuplicates(numArr);
			System.out.println(Arrays.toString(Arrays.copyOfRange(numArr,0,len)));
		}
		int[] nums6 = {10,1,0,-1,10,5,10,3,10};
		numArrs1.add(nums6);
		int[] elems = {2,1,1,90,0,10};
		System.out.println("\n\nRemove Element:\n");
		int i = 0;
		for (int[] numArr : numArrs1){
			System.out.print(Arrays.toString(numArr) +" remove " + elems[i] + " --> ");
			int len = removeElement(numArr,elems[i]);
			System.out.println(Arrays.toString(Arrays.copyOfRange(numArr,0,len)));
			i++;
		}
	}
}