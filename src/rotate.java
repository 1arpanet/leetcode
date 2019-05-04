public class rotate {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        if (n==0){
            return;
        }
        k%=n;
        rotatehelper(nums,0,n-k-1);
        rotatehelper(nums,n-k,n-1);
        rotatehelper(nums,0,n-1);


    }
    public void rotatehelper(int[] nums,int s,int e){
        while(s<e){
            int tmp=nums[s];
            nums[s++]=nums[e];
            nums[e--]=tmp;
        }
    }

    public static void main(String[] args) {
        rotate test=new rotate();
        int[] nums={};
        test.rotate(nums,3);
        for (int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
