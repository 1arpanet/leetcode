public class missingNumber3 {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int res=n;
        for (int i=0;i<n;i++){
            res^=i^nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        missingNumber3 test=new missingNumber3();
        int[] nums={1,4,3,0};
        System.out.println(test.missingNumber(nums));
    }
}
