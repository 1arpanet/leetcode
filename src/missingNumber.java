import java.util.Arrays;

public class missingNumber {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if (nums[nums.length-1]!=nums.length){
            return nums.length;
        }
        if (nums[0]!=0){
            return 0;
        }
        for (int i=1;i<nums.length;i++){
            if (nums[i]!=i){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        missingNumber test=new missingNumber();
        int[] nums={};
        System.out.println(test.missingNumber(nums));
    }
}
