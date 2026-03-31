package Arrays;

import java.util.Arrays;

public class first {
    public static void main(String[] args) {
        int[] arr={2,1,3,4};
        System.out.println(check(arr));

    }

    public static boolean check(int[] nums) {
        int n=nums.length;
        if(n<=1)
        {
            return true;
        }
        if(isSorted(nums))
        {
            return true;
        }
        int count=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                count=n-i-1;
                break;
            }
        }

        int[] b=new int[nums.length];

        for(int i=0;i<b.length;i++)
        {
            b[i]=nums[(i+count+1)%n];
        }
        System.out.println(Arrays.toString(b));
        if(isSorted(b))
        {
            return true;
        }
        return false;



    }

    public static boolean isSorted(int[] nums)
    {
        boolean isSorted=true;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<nums[i-1])
            {
                isSorted=false;
            }

        }
        if(isSorted)
        {
            return true;
        }
        return false;
    }





}
