//Arrays
class functionExamples {

    public static void main(String[] args) {

    }

    public static void swap(int[] nums, int spot1, int spot2){
        int temp = nums[spot1];
        nums[spot1] = nums[spot2];
        nums[spot2] = temp;
    }
}