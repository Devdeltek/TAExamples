import java.util.Arrays;

//Arrays
class mergeSort {
    public static void main(String[] args) {
        int[] nums = new int[10];

        for(int i = 0; i < nums.length; i++){
            nums[i] = (int)(Math.random() *100) + 1;
        }

        nums = mergeSort(nums);

        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + ", ");
        }
    }

    public static int[] mergeSort(int arr[]){
        if(arr.length == 1){
            return arr;
        }
        else{
            int[] a = Arrays.copyOfRange(arr, 0, arr.length/2);
            int[] b = Arrays.copyOfRange(arr, arr.length/2, arr.length);


            return merge(mergeSort(a), mergeSort(b));
        }
    }

    public static int[] merge(int[] a, int[] b){

        int[] c = new int[a.length + b.length];

        int aItr = 0;
        int bItr = 0;
        int cItr = 0;

        while(aItr < a.length && bItr < b.length){
            if(a[aItr] < b[bItr]){
                c[cItr++] = a[aItr++];
            }
            else{
                c[cItr++] = b[bItr++];
            }
        }
        while(aItr < a.length){
            c[cItr++] = a[aItr++];
        }
        while(bItr < b.length){
            c[cItr++] = b[bItr++];
        }
        
        return c;
    }

}