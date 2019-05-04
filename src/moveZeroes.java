public class moveZeroes {
    public void moveZeroes(int[] nums) {
        int NoneZeroIndex=0;
        int n=nums.length;
        for (int i=0;i<n;i++){
            if (nums[i]!=0){
                nums[NoneZeroIndex++]=nums[i];
            }
        }
        for (int i=NoneZeroIndex;i<n;i++){
            nums[i]=0;
        }

    }
}
