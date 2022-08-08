//Arrays
class stringExamples {
    public static void main(String[] args) {

        //https://www.w3schools.com/java/java_ref_string.asp

        System.out.println("--------------Example 1: -----------------------------");




        //initializes empty string
        String word;

        //Stores 'First' in the string
        word = "First";

        //prints whatever is stored in word
        System.out.println(word);

        //Stores 'Two' in the array, overwrites 'First'
        word = "Two";

        //prints new value in word
        System.out.println(word);

        //Empties word
        word = "";
        

        System.out.println("--------------Example 2: -----------------------------");


        //Initializes a string with 'Devin'
        String firstName = "Devin";

        //loops through the string, prints each character individually
        for(int i = 0; i < firstName.length(); i++){
            System.out.println(firstName.charAt(i));
        }



        System.out.println("--------------Example 3: -----------------------------");

        //Stores 'Delaney' in a new String variable
        String lastName = "Delaney";

        //concatenates firstName, a space, and lastName into one String
        String fullName = firstName + " " + lastName;

        System.out.println(fullName);


        System.out.println("--------------Example 4: -----------------------------");

        //stores a new name in full name
        fullName = "Joshua Gross";

        //empties firstName and lastName
        firstName = "";
        lastName = "";

        //sets space equal to the first index of ' ', in this case 7
        int space = fullName.indexOf(' ');

        
        //stores index 0 - space in firstName, not including space.
        //Will store the characters in full name at indexes 0 - 6, or J, O, S, H, U, and A
        firstName = fullName.substring(0, space);
        System.out.println(firstName);

        //Stores all the characters after space + 1 in last name
        //Will store G, R, O, S, and S
        lastName = fullName.substring(space+1);
        System.out.println(lastName);

    }
}