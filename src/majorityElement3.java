public class majorityElement3 {
    public int majorityElement(int[] nums) {
        int tmp=nums[0];
        int times=1;
        for (int i=1;i<nums.length;i++) {
                if (nums[i] == tmp) {
                    times++;
                } else {
                    times--;
                }
            if (times == 0) {
                tmp = nums[i];
                times = 1;
            }
        }
            int count=0;
            for(int arr:nums){
                if (arr==tmp){
                    count++;
                }
            }
            if (count>nums.length/2){
                return tmp;
            }
            else
                return  0;
    }
    public static void main(String[] args) {
        majorityElement3 test=new majorityElement3();
        int[] nums={2,2,1,1,1,2,2};
        System.out.println(test.majorityElement(nums));
    }

}
