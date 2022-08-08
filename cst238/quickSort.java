import java.util.Arrays;

//Arrays
class quickSort {
    public static void main(String[] args) {
        int[] nums = new int[10];

        for(int i = 0; i < nums.length; i++){
            nums[i] = (int)(Math.random() *100) + 1;
        }

        quickSort(nums, 0, nums.length-1);

        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + ", ");
        }
    }

    public static void quickSort(int arr[], int low, int high){
            if(low < high){
                int pivot = partition(arr, low, high);

                quickSort(arr, low, pivot-1);
                quickSort(arr, pivot+1, high);
        }
    }

    public static int partition(int[] arr, int low, int high){

        int pivot = arr[high];
        int left = low;

        for(int i = low; i < high; i++){
            if(arr[i] < pivot){
                swap(arr, i, left);
                left++;
            }
        }

        swap(arr, high, left);

        return left;
    }

    public static void swap(int[] nums, int spot1, int spot2){
        int temp = nums[spot1];
        nums[spot1] = nums[spot2];
        nums[spot2] = temp;
    }
}