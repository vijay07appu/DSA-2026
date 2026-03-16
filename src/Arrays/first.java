package Arrays;

public class first {
    public static void main(String[] args) {
        int[] arr={7, 7, 2, 2, 10, 10,8, 10};
        System.out.println(secondLargestElement(arr));

    }
    public static int secondLargestElement(int[] nums) {
        int max=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {

            if(nums[i]>max)
            {
                second=max;
                max=nums[i];
            }
            else if(nums[i]!=max && nums[i]>second)
            {
                second=nums[i];

            }

        }
        if(second==Integer.MIN_VALUE)
        {
            return -1;
        }
        return second;
    }



}
