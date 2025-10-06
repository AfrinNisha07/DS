public class Targetnum {
    int nums[]={1,1,2,3,4,5,6};
    int target=5;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == target) {
            System.out.println("Found at index: " + i);
           // stops as soon as found
        }
        break;
    }
}
