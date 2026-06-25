class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList <Integer> l1 = new ArrayList<>();
        int n = nums.length;
        int maj = n/3;
        int num1 =0 ;
        int num2 =0;
        int count1 =0;
        int count2 =0;

        for(int i =0;i<n;i++){
            if(nums[i] == num1){
                count1++;
            }else if(nums[i] == num2){
                count2++;
            }else if(count1 == 0){
                num1 = nums[i];
                count1 =1;
            }else if(count2 == 0){
                num2 = nums[i];
                count2 =1;
            }else{
                count1--;
                count2--;
            }
        }
        count1 =0;
        count2 =0;
        for(int i =0;i<n;i++){
            if(nums[i] == num1) {
                count1++;
            }
            else if (nums[i] == num2){
              count2++;  
            } 
        }
        
        if(count1 >maj) l1.add(num1);
        if(count2 >maj) l1.add(num2);
        return l1;
    }
}