package search;

import java.util.*;



public class LinearSearch {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 10,8, 9}
        };
        List<Integer> indexs=search(arr,8);
        System.out.println(indexs);
    }

    public static  List<Integer> search(int[][] arr,int target){

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]==target)
                {
                    List<Integer> index=new ArrayList<>();
                    index.add(i);
                    index.add(j);
                    return index;
                }
            }
        }
        return new ArrayList<>(Arrays.asList(-1));


    }

}
