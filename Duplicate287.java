class Duplicate287{
    public static void main(String[] args) {
        int arr[] = {1,3,4,2,2};
        Solution s = new Solution();
        int ans = s.findDuplicate(arr);
        System.out.println(ans);

    }
}



class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while(i<nums.length){
            if(nums[i]!=i+1){

                int correct = nums[i] - 1;
                if(nums[correct]!= nums[i]){
                    swap(nums,i,correct);
                }
                else{
                    return nums[i];
                }
            }else {
                i++;
            }
        }
        return -1;
    }
    public static void swap(int[] arr, int a ,int b){
        int t= arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
}
