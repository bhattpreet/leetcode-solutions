public class Leetcode41 {
    public static void main(String[] args) {
        int [] arr = {3,4,-1,1};
        Solution s = new Solution();
        System.out.println(s.firstMissingPositive(arr));
    }
}
class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correct = nums[i] - 1;
            if(correct>=0 && correct<nums.length){
                if( nums[i]!=nums[correct]){
                    swap(nums,i,correct);
                }else{
                    i++;
                }
            }else{
                i++;
            }

        }
        int j = 0 ;
        for( j =0;j<nums.length;j++){
            if(nums[j]!=j+1){
                return j+1;
            }
        }
        return j+1;
    }
    public static void swap(int []arr,int a, int b){
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
}