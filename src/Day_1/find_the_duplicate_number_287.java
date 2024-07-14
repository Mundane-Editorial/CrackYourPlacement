package Day_1;

public class find_the_duplicate_number_287 {
    public static void main(String args[]){
        int[] nums= {3,1,3,4,2};
        System.out.println(findDuplicate(nums));
    }
    static public int findDuplicate(int[] nums) {
        int turtle = 0;
        int hare = 0;
        while(true){
            turtle = nums[turtle];
            hare = nums[nums[hare]];

            if(turtle == hare){
                break;
            }
        }

        int turtle2 = 0;
        while(true){
            turtle = nums[turtle];
            turtle2 = nums[turtle2];
            if(turtle == turtle2){
                break;
            }
        }
        return turtle;
    }
}
