import java.util.HashSet;
import java.util.Set;

public class missingNumber2 {
    public int missingNumber(int[] nums) {
        Set<Integer> set=new HashSet<Integer>();
        for (int num:nums){
            set.add(num);
        }
        int n=nums.length;
        for (int i=0;i<n+1;i++){
            if (!set.contains(i)){
                return i;
            }
        }
        return -1;
    }
}
