class Solution {
    public int search(int[] nums, int target) {
        // for(int i = 0;i<nums.length;i++){
        // if(nums[i]==target){
        //     return i;
        // }
        // }
        // return -1;
        int l = 0;
        int r = nums.length-1;
        int ans = 0;
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid]==target){
                return mid;
            // ans = mid;
            // r = mid+1;
            }
            else if(nums[l]<=nums[mid]){//upper line ka code...
              if(nums[l]<=target && nums[mid]>target){
                r = mid-1;
              }
            else{
             l = mid + 1;
            }
         }
            else{//lower line ka code..
if(nums[r]>=target && nums[mid]<target){
                l = mid+1;
              }
            else{
             r = mid - 1;
            }

            }


    }
      return -1;
}
}