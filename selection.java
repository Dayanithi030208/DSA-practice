import java.util.*;
public class selection{
    public static void main(String[] args){
        int[] nums={47, 12, 5, 89, 33, 7, 58, 21, 3, 72};
        int n=nums.length;
        for(int i=0;i<n;i++){
            int mini=i;
            int j=i+1;
            for(;j<n;j++){
                if(nums[j]<=nums[mini]) {
                    mini=j;
                }
            }
            swap(nums,i,mini);
        }
        System.out.println(Arrays.toString(nums));
    }
    private static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}