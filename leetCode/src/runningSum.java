import java.util.TreeSet;

public class runningSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,1,2};
		removeDuplicates(nums);
	}
	public static void removeDuplicates(int[] nums) {
        TreeSet<Integer> sa = new TreeSet<Integer>();
        for(int i=0;i<nums.length;i++){
            sa.add(nums[i]);
        }
        System.out.println(sa);;
    }
}
