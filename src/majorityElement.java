import java.util.HashMap;
import java.util.Map;

public class majorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for (int i=0;i<n;i++){
            if (map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else {
                map.put(nums[i],1);
            }
        }
        int res=0;
        for (int i=0;i<n;i++){
            if (map.get(nums[i]).compareTo(n/2)>0){
                res=nums[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        majorityElement test=new majorityElement();
        int[] nums={3,2,3};
        System.out.println(test.majorityElement(nums));
    }
}
