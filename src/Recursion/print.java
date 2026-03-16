package Recursion;

import java.util.Arrays;

public class print {
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        return isPal(s,0,s.length()-1);

    }

    public static boolean isPal(String s,int start,int end)
    {
        if(start>=end)
        {
            return true;
        }
        if(!Character.isLetterOrDigit(s.charAt(start)))
        {
            start++;
        }
        else if(!Character.isLetterOrDigit(s.charAt(end)))
        {
            end--;
        }
        else if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end)))
        {
            return false;
        }
        else{
            return isPal(s,start+1,end-1);
        }
        return isPal(s,start,end);


    }
}
