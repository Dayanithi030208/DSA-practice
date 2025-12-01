import java.util.Arrays;
public class insertion {
    public static void main(String[] args) {
        int[] nums={47, 12, 5, 89, 33, 7, 58, 21, 3, 72};
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]) continue;
            for(int j=i;j>=1;j--){
                if(nums[j]>nums[j-1]) break;
                int temp=nums[j];
                nums[j]=nums[j-1];
                nums[j-1]=temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
