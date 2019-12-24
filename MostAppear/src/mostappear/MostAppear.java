package mostappear;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class MostAppear {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
        String input = "bcad";

        HashMap<Character, Integer> count = new HashMap<>();

        int sizeInput = input.length();
        char currCharacter, maxCharacter = 'z';
        int currCharacterCount, maxCharacterCount = 0;
        
        for (int i = 0; i < sizeInput; i++) {
            currCharacter = input.charAt(i);

            if (count.containsKey(currCharacter)) {//checking if exists
                
                currCharacterCount = count.get(currCharacter);//getting count
                count.put(currCharacter, currCharacterCount + 1);//adding to hashmap
                
                if (currCharacterCount + 1 > maxCharacterCount) {//checking if count is *more* than earlier max character
                
                    maxCharacterCount = currCharacterCount + 1;
                    maxCharacter = currCharacter;
                } 
                else if (currCharacterCount + 1 == maxCharacterCount) {//if equal, checking small character -> change max character
                    if (currCharacter < maxCharacter) {
                        maxCharacter = currCharacter;
                    }
                }
            } 
            else {
                count.put(currCharacter, 1);
                if (currCharacter < maxCharacter && maxCharacterCount <= 1) {//checking max for first occurences and if max is 1
                    maxCharacterCount = 1;
                    maxCharacter = currCharacter;
                }
            }
        }
        System.out.println("" + maxCharacter + "," + maxCharacterCount);
    }

}
