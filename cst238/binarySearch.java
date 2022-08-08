class binarySearch {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(binarySearch(nums, 10));
    }

    public static int binarySearch(int[] arr, int val){
        int low = 0;
        int high = arr.length;
        int spot = arr.length/2;

        while(low <= high){
            if(arr[spot] == val){
                return spot;
            }
            else if(arr[spot] < val){
                low = spot+1;
            }
            else{
                high = spot-1;
            }
            spot = (low + high)/2 ;
        }
        return -1;
    }
}