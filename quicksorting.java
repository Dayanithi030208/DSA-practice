import java.util.Arrays;

public class quicksorting {
    public static void main(String[] args) {
        int[] nums={47, 12, 5, 89, 33, 7, 58, 21, 3, 72};
        int n=nums.length;
        quicksort(nums,0,n-1);
        System.out.println(Arrays.toString(nums));
    }
    private static void quicksort(int[] nums,int i,int j){
        if(i<j){
            int partion=partionIndex(nums,i,j);
            quicksort(nums,i,partion-1);
            quicksort(nums,partion+1,j);
        }
    }
    private static int partionIndex(int[] nums,int i,int j){
        int pivot=nums[i];
        int low=i;
        int high=j;
        while(low<=high){
            while(low<=j&&nums[low]<=pivot) low++;
            while(high>=i&&nums[high]>pivot) high--;
            if(low<=high) swap(nums,low,high);
        }
        swap(nums,i,high);
        return high;
    }
    private static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
