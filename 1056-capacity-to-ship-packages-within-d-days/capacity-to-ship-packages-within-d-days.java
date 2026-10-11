class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i =0 ;i<n ;i++){
            max = Math.max(weights[i],max);
            sum = sum + weights[i];
        }
        int ans = sum+1;
        int low =max, high =sum;
        while(low<=high){
            int mid = (low+high)/2;
            int reqDays = daysrequired(weights,n,mid,days);
            if(reqDays>days){
                low = mid +1;
            }
            else{
                high = mid -1;
                ans = Math.min(ans,mid);
            }
        }
        return ans;
    }

    public int daysrequired(int[] weights,int n ,int capacity, int maxdays){
        int loadperday =0;
        int days =1;

        for(int i =0;i<n ;i++){
            if((loadperday+weights[i])>capacity){
                loadperday = weights[i];
                days = days +1;
            }
            else{
                loadperday += weights[i];
            }
        }
        return days;
    }
}