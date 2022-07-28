//Arrays
class arrayExamples {
    public static void main(String[] args) {



        System.out.println("--------------Example 1: -----------------------------");




        //initializes empty int array with 10 empty spaces allocated
        int[] nums = new int[10];
        
        //loops from i = 0 to i = 9
        for(int i = 0; i < 10; i++){
            //sets the value of the nums array at i to i^2
            nums[i] = i;
        }
        
        //loops through all the values in the array using array.length, starting at 0
        for(int i = 0; i < nums.length; i++){
            //prints the values stored in the array at i and a space.
            System.out.print(nums[i] + " ");
        }
        
        //prints a blank line
        System.out.println();


        

        System.out.println("--------------Example 2: -----------------------------");




        //initializes a filled int array
        int[] moreNums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        //loops through values i = 0 - i = 9
        for(int i = 0; i < 10; i++){
            //sets the value of moreNums at i to the value of nums at i * the values of moreNums at i
            moreNums[i] = nums[i] * moreNums[i];
        }
        
        //For each loop, it will loop through every value in the moreNums array, assigning it to num
        for(int num : moreNums){
                System.out.print(num + " ");
        }
        
        //prints a blank line
        System.out.println();
        



        System.out.println("--------------Example 3: -----------------------------");


        
        //initializes a filled character array
        char[] lets = {'C', 'h', 'a', 'r'};
        
        //initializes and empty String variable
        String word = "";
        
        //loops through all the values in lets and adds them to the String one by one
        for(int i = 0; i < lets.length; i++){
            word = word + lets[i];
        }
        
        //prints the now filled string
        System.out.println(word);
        
        //prints a blank line
        System.out.println();



        System.out.println("--------------Example 4: -----------------------------");



        //makes a filled boolean array
        boolean[] mask = {true, false, false, true};
        
        //loops through i=0 - i = 3
        for(int i = 0; i < lets.length; i++){
            //checks if mask at i is true, if it is prints lets at i.
            if(mask[i]){
                System.out.print(lets[i]);
            }
        }
    }
}