package search;

import java.util.Arrays;

public class binarySearch {

    public static void main(String[] args) {
        int[] arr={10,40,40,40,40};
        int target=40;
        searchRange(arr,target);
    }
    public static int[] searchRange(int[] nums, int target) {
        if(nums.length==0)
        {
            return new int[]{-1,-1};
        }
        int start=0;
        int end=nums.length-1;
        int[] arr=new int[]{-1,-1};
        System.out.println(Arrays.toString(arr));
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(start==end)
            {
                arr[0]=start;
                break;
            }
            else if(nums[mid]==target)
            {
                end=mid;


            }
            else if(nums[mid]<target)
            {
                start=mid+1;
            }
            else if(nums[mid]>target)
            {
                end=mid-1;
            }
        }
        start=0;
        end=nums.length-1;

        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(start==end)
            {
                arr[1]=start;
                break;
            }
            if(nums[mid]==target)
            {
                start=mid+1;


            }
            else if(nums[mid]<target)
            {
                start=mid+1;
            }
            else if(nums[mid]>target)
            {
                end=mid-1;
            }

        }
        System.out.println(Arrays.toString(arr));
        return arr;


    }



}
