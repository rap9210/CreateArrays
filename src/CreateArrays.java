import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CreateArrays {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
       /*
       Ask for input for parameters and array elements
       > Initiate Array and assign data type.
       >>for loop that assigns elements to array.
       >>>if/else statement to take those elements and append them to a
       string so that they can be printed onto the console.
       */
        System.out.println("Enter number to create an array of that number and all smaller numbers.");
        int int_array = scn.nextInt();
        int numbers [];
        String array_in_string = "Numbers: [";
        numbers = new int[int_array];
        for (int i=int_array-1;i>=0;i--) {
            numbers[i] = i + 1;
            if (i > 0) {
                array_in_string += i + 1 + ", ";
            }else {
                array_in_string += i + 1 + "]";
            }
        }System.out.println(array_in_string);
       /*
        Initialize array "words". >> define size >> assign word to every index.
        >>use for loop to map the array to a custom string for print.
       */

        String words[];
        words = new String[7];
        words[0] = "hello";
        words[1] = "goodbye";
        words[2] = "farewell";
        words[3] = "adios";
        words[4] = "man";
        words[5] = "woman";
        words[6] = "child";
        String words_print = "Words: [";
        for (int i=0; i<=Array.getLength(words)-1;i++){
            if (i < Array.getLength(words)-1){
                words_print+=words[i]+", ";
            }
            else{
                words_print+=words[i]+"]";
            }
        }System.out.println(words_print);
        /*
        Same as with the string array but with characters.
         */
        char letters[];
        letters = new char[5];
        letters[0] = 'a';
        letters[1] = 'b';
        letters[2] = 'c';
        letters[3] = 'd';
        letters[4] = 'e';
        int L = Array.getLength(letters);
        String letters_print = "Characters: [";
        for(int i=0; i<=L-1;i++){
            if (i<L-1){
                letters_print+=letters[i]+", ";
            }
            else {
                letters_print+=letters[i]+"]";
            }
        }System.out.println(letters_print);
        /*
        same with boolean array
         */
        boolean b_array[];
        b_array = new boolean[2];
        b_array[0]=true;
        b_array[1]=false;
        int b_array_l = Array.getLength(b_array);
        String b_array_str = "Booleans: [";
        for (int i=0; i<=b_array_l-1;i++){
            if (i<b_array_l-1){
                b_array_str+=b_array[i]+", ";
            }
            else {
                b_array_str+=b_array[i]+"]";
            }
        }System.out.println(b_array_str);


        //        Arrays.toString(letters);         Secondary Method
        //        System.out.println(letters);
    }





}


