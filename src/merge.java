public class merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i1=m-1;
        int i2=n-1;
        int k=m+n-1;
        while(i1>=0&&i2>=0){
            if (nums2[i2]>nums1[i1]){
                nums1[k]=nums2[i2];
                k--;
                i2--;
            }
            else{
                nums1[k]=nums1[i1];
                k--;
                i1--;
            }
        }
        while(i2>=0){
            nums1[k--]=nums2[i2--];
        }

    }

    public static void main(String[] args) {
        merge test=new merge();
        int[] nums1={1,2,4,0,0,0};
        int[] nums2={2,5,6};
        test.merge(nums1,3,nums2,3);
        for (int i=0;i<nums1.length;i++){
            System.out.print(nums1[i]);
        }


    }
}
