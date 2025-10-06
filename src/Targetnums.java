public class Targetnums {
    public static void main(String[] args) {
        int [] nums={1,2,1,3,4,6,5};
       int   target=6;
       boolean found=containsTarget(nums , target);

        System.out.println("Target found  "+found);
    }
    public static boolean containsTarget(int nums[],int target){
        for (int num:nums){
            if (num==target){
                return true;
            }

        }
        return false;
    }
}
