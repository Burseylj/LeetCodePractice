import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ShortestPathInArray {
	
	/*Given an array of non-negative integers, you are initially positioned at the first index of the array.  

	Each element in the array represents your maximum jump length at that position.

	Your goal is to reach the last index in the minimum number of jumps.*/
	
	public static List<Integer> jump(int[] nums) {
        if (nums.length <= 1) return new ArrayList<Integer>();
        int jumpStart = 0;
        int jumpEnd = nums[0];
        int nextJumpI = 0;
        ArrayList<Integer> path = new ArrayList<Integer>();
        path.add(0);
        //cycle through new jumps until we can reach the end
        while (jumpEnd< nums.length-1) {
            //find new jump point that gets us the furthest
            for (int i = jumpStart; i <= jumpEnd; i++) {
                //if we can jump further than before, this is the new next jump point
                if (nums[i] + i > nums[nextJumpI] + nextJumpI) {
                    nextJumpI = i;
                }
            }
            if (jumpEnd == nextJumpI + nums[nextJumpI] ) return null;
            jumpStart = nextJumpI;
            jumpEnd = nextJumpI + nums[nextJumpI];
            path.add(nextJumpI);
        }
        path.add(nums.length -1);
        return path;
    }


	public static void main(String[] args) {
		List<int[]> testArrays = new ArrayList<int[]>();
		testArrays.add(new int[] {1,1,1,1});
		testArrays.add(new int[] {4,1,1,1});
		testArrays.add(new int[] {2,1,5,1,1,3,2});
		testArrays.add(new int[] {});
		testArrays.add(new int[] {1,2,3,4,5,6,7,8,9,10});
		for (int[] nums : testArrays) {
			System.out.println("Path for " + Arrays.toString(nums) + " -> " + jump(nums));
		}
	}
}
