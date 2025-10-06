public class Palindrome {
    public static void main(String[] args) {
        String str="RACECAR";
        if(isPalindrome(str,0,str.length()-1)){
            System.out.println("it is palindrome");
        }else{
            System.out.println("it is not palindrome");
        }
    }
     static boolean isPalindrome(String str, int left,int right){
        if (left>=right){
            return true;
        }
        if(str.charAt(left)!=str.charAt(right)){
            return false;
        }
         return isPalindrome(str,left+1,right-1);
    }

}
