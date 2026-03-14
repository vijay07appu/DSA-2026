package Patterns;

public class Pattern {
    public static void main(String[] args) {
       int n=4;
       for(int i=0;i<2*n-1;i++)
       {
           for(int j=0;j<2*n-1;j++)
           {
               int top=j;
               int left=i;
               int bottom=(2*n-1)-1-i;
               int right=(2*n-1)-1-j;
               int number=Math.min(Math.min(top,left),Math.min(bottom,right));
               number=n-number;
               System.out.print(number);
           }
           System.out.println();
       }
    }
}
