import java.util.Arrays;
public class mergesorting {
    public static void main(String[] args) {
        int[] nums={47, 12, 5, 89, 33, 7, 58, 21, 3, 72};
        int n=nums.length;
        mergesort(nums,0,n-1);
        System.out.println(Arrays.toString(nums));
    }
    private static void mergesort(int[] nums,int i,int j){
        if(i>=j) return ;
        int mid=(i+j)/2;
        mergesort(nums,i,mid);
        mergesort(nums,mid+1,j);
        merge(nums,i,j,mid);
    }
    private static void merge(int[] nums,int i,int j,int mid){
        int left=i;
        int right=mid+1;
        int[] AuxiArray=new int[j-i+1];
        int index=0;
        while(left<=mid&&right<=j){
            if(nums[left]<nums[right]){
                AuxiArray[index++]=nums[left];
                left++;
            }
            else{
                AuxiArray[index++]=nums[right];
                right++;
            }
        }
        while(left<=mid) AuxiArray[index++]=nums[left++];
        while(right<=j) AuxiArray[index++]=nums[right++];
        for(int k=0;k<AuxiArray.length;k++){
            nums[i+k]=AuxiArray[k];
        }
    }
}
