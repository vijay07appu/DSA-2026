package search;

public class Koko {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println(shipWithinDays(arr,1));

    }

    public static int shipWithinDays(int[] weights, int days) {
        int sum=0;
        for(int weight:weights){
            sum=sum+weight;
        }
        int start=1;
        int end=sum;
        int ans=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            int weightSum=0;
            int countDays=0;
            for(int i=0;i<weights.length;i++){
                if(weightSum+weights[i]>mid)
                {
                    countDays++;
                    weightSum=weights[i];

                }
                else if(weightSum+weights[i]==mid)
                {
                    countDays++;
                    weightSum=0;
                }
                else{
                    weightSum=weightSum+weights[i];
                }
            }
            if(weightSum!=0)
            {
                countDays++;

            }

            if(countDays<=days)
            {
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
}
