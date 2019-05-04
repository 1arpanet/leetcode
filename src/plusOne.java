public class plusOne {
    public  int[] plusOne(int[] digits){
        int n=digits.length;
        for (int i=n-1;i>=0;i--){
            if (digits[i]<9){
                digits[i]+=1;
                return digits;
            }
            digits[i]=0;

        }
        int[] newNums=new int[n+1];
        newNums[0]=1;
        return newNums;
    }

    public static void main(String[] args) {
        plusOne test=new plusOne();
        int[] nums={4,9,9,9,};
        System.out.println(test.plusOne(nums));

    }
}
