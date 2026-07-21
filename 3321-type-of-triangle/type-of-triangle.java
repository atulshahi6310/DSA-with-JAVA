class Solution {
    public String triangleType(int[] nums) {
        String str = "" ;
        if(nums[0]+nums[1] >nums[2] && nums[1]+nums[2] >nums[0] && nums[0] +nums[2] >nums[1]){



        if(nums[0] == nums[1] && nums[1]==nums[2]){
            str += "equilateral";
            return str;
        }else if((nums[0] != nums[1] && nums[1]==nums[2]) ||
                (nums[0] == nums[1] && nums[1]!=nums[2])||
                (nums[0] == nums[2] && nums[1]!=nums[2])
                
        ){
            str += "isosceles";
            return str;
        }else if(nums[0] != nums[1] && nums[1] != nums[2] && nums[0] != nums[2]){
             str += "scalene";
            return str;
        }
        }
        return "none";

    }
}