package search;

public class Single {

    public static void main(String[] args) {
        int[] nums={1,1,2,3,3,4,4,8,8};
        System.out.println("ans is "+singleNonDuplicate(nums));
    }

        public static  int singleNonDuplicate(int[] nums) {

            int start=0;
            int end=nums.length-1;

            while(start<=end){

                int mid=start+(end-start)/2;
                if(mid==0)
                {
                    if(nums[mid]!=nums[mid+1])
                    {
                        return nums[mid];
                    }
                }
                else if(mid==nums.length-1){
                    if(nums[mid]!=nums[mid-1])
                    {
                        return nums[mid];
                    }

                }
                else if(mid>0 && mid<nums.length-1)
                {
                    if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]){
                        return nums[mid];

                    }
                }

                    boolean isEven=false;
                    if(mid%2==0)
                    {
                        isEven=true;
                    }

                    if(isEven)
                    {
                        if(nums[mid]!=nums[mid-1])
                        {
                            start=mid;
                        }
                        else{
                            end=mid-1;
                        }
                    }
                    else{
                        if(nums[mid]==nums[mid-1])
                        {
                            start=mid+1;
                        }
                        else{
                            end=mid;
                        }
                    }



            }
            return -1;

        }

}
