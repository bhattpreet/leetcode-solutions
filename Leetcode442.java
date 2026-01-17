import java.util.ArrayList;
import java.util.List;

class Leetcode442 {
    public static void main(String[] args) {
    int [] arr = {4,3,2,7,8,2,3,1};
    solution s = new solution();
    List<Integer> ans = new ArrayList<>();
    ans = s.findDuplicates(arr);
        System.out.println(ans);
    }

}
class solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int i = 0,count = 0;
       while(i<nums.length) {
       int correct = nums[i] - 1;
       if(nums[correct]!=nums[i]) {
           swap(correct, i, nums);
       }else{
           i++;

       }
       }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!= j+1){
                ans.add(nums[j]);
            }
        }
       return ans;
    }
    public static void swap(int a , int b, int[] arr){
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
}