public class maxSubArray {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int res=nums[0];
        for (int j=1;j<nums.length;j++){
            max=Math.max(max+nums[j],nums[j]);
            if (max>res){
                res=max;
            }
        }
    return res;
    }

    public static void main(String[] args) {
        maxSubArray test=new maxSubArray();
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(test.maxSubArray(nums));
    }
}
