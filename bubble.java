import java.util.Arrays;
public class bubble {
    public static void main(String[] args){
        int[] nums={47, 12, 5, 89, 33, 7, 58, 21, 3, 72};
        int n=nums.length;
        boolean sort=true;
        for(int i=n-1;i>0;i--){
            for(int j=0;j<i-1;j++){
                if(nums[j]>nums[j+1]){
                    swap(nums,j,j+1);
                    sort=false;
                }
            }
            if(sort) break;
        }
        System.out.println(Arrays.toString(nums));
    }
    private static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
