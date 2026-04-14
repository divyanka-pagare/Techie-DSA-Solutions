164. Maximum Gap



class Solution {
public:
    int maximumGap(vector<int>& nums) {
        if(nums.size() < 2)return 0;//check size
        //sort the arr
        sort(nums.begin(),nums.end());
        int maxGap = 0;
        for(int i = 1;i < nums.size();i++){
            maxGap = max(maxGap,nums[i]-nums[i-1]);
        }
        return maxGap;
    }
};
