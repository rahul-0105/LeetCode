class Solution {
    public void reverse(int[] nums, int start,int end){
            //  int front = 0;
            //  int last=nums.length-1;

        while(start<end){
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    // public void print(int[] nums){
    //     for(int i=0;i<nums.length;i++){
    //         System.out.println(nums[i]);
    //     }
    // }
    public void rotate(int[] nums, int k) {
       if(k>nums.length){
                k=k%nums.length;
             }
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        //print(nums);
    }
}