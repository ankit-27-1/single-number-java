class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        int store=0;
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                if(nums[j-1]>nums[j]){
                    temp=nums[j-1];
                    nums[j-1]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        if(n==1){
            return nums[0];
        }
        for(int i=0;i<n-1;i=i+2){
            if(nums[i]!=nums[i+1]){
                return nums[i];
            }
        }

        return nums[n-1];
    }
}
