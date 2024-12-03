package basicprograms;

import java.util.Arrays;

public class Anagram {
    public static boolean Anagramornot(String str1,String str2){
        str1=str1.replaceAll("\\s","").toLowerCase();
        str2=str2.replaceAll("\\s","").toLowerCase();
        if(str1.length() !=str2.length()){
            return false;
        }
        char[] chararr1=str1.toCharArray();
        char[] chararr2=str2.toCharArray();

        Arrays.sort(chararr1);
        Arrays.sort(chararr2);
        return Arrays.equals(chararr1, chararr2);



    }
    public static void main(String args[]){
        //Taking two stings
        //remove spaces and conver into Lowercases
        //all the characters in the string are stored in char array
        //and it will sort the array
        //compare two array ,if they are equal returns true
        //otherwise false

        String str1="The Eyes";
        String str2="They saw";
        if(Anagramornot(str1,str2)){
            System.out.println("These two words are Anagram");
        }
        else{
            System.out.println("These two  words are not angrams");
        }

    }
    
}
