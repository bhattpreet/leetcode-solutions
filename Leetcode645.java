import java.util.Arrays;

class Leetcode645 {
    public static void main(String[] args) {
        int [] arr = {2,2};
        Sol s = new Sol();


        System.out.println(Arrays.toString(s.findErrorNums(arr)));
    }
}
class Sol {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        int [] ans = new int[2];
        while(i<nums.length){
            int correct = nums[i] -  1;
            if(nums[correct]!=nums[i]){
                swap(correct,i,nums);
            }
            else{
                i++;
            }

        }

        for(int j=0 ; j<nums.length;j++){
            if(nums[j]!=j+1){
                ans[0] = nums[j];
                ans[1] = j + 1;

            }
        }
        return ans;
    }
    public static void swap(int a , int b ,int[] arr){
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
}