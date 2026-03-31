package search;

public class splitArray {

    public static void main(String[] args) {
        int[] nums={7, 2, 5, 10, 8};
        int k=2;
        System.out.println("ans is "+split(nums,k));
    }


        public static int split(int[] nums, int k) {

            int start=Integer.MAX_VALUE;
            int end=0;
            for(int num:nums)
            {
                if(num<start)
                {
                    start=num;
                }
                end=end+num;
            }
            System.out.println("start is "+start);
            System.out.println("end is "+end);
            int ans=start;
            while(start<=end)
            {
                int mid=start+(end-start)/2;
                int sum=0;
                int pieces=1;
                for(int num:nums)
                {
                    if(sum+num>=mid)
                    {
                        pieces++;
                        sum=num;

                    }else{
                        sum=sum+num;

                    }
                }
                if(pieces>=k)
                {
                    ans=mid;
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            return ans;

        }
    }

