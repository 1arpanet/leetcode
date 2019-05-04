public class majorityElement2 {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        if (nums==null&&n==0){
            return 0;
        }
        parttition(nums,0,n-1);
        int res=nums[n/2];
        int count=0;
        for (int i=0;i<n;i++){
            if (nums[i]==res){
                count++;
            }
        }
        if (count>n/2){
            return res;
        }
        else
            return 0;
    }
    public void parttition(int[] nums,int s,int e){
        int v=nums[s];
        int lt=s;
        int gt=e+1;
        int i=s+1;
        while(i<gt){
            if (nums[i]<v){
                swap(nums,i,lt+1);
                i++;
                lt++;
            }
            else if (nums[i]>v){
                swap(nums,i,gt-1);
                gt--;
            }
            else {
                i++;
            }
        }
        swap(nums,s,lt);
        if (s<lt-1){
            parttition(nums,s,lt-1);

        }
        if (gt<e){
            parttition(nums,gt,e);
        }
    }
    private void swap(int[] nums,int i,int j){
        int tmp=nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
    }

    public static void main(String[] args) {
        majorityElement2 test=new majorityElement2();
        int[] nums={-1,1,1,1,2,1};
        System.out.println(test.majorityElement(nums));
    }
}
